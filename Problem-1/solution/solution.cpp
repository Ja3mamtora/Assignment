#include <string>
#include<unordered_map>
#include<queue>
#include <iostream>


using namespace std;
string fashionOrganize(string s)
{
    // Step 1: Count the frequency of each character
    unordered_map<char, int> freq_map;
    for (char c : s)
    {
        freq_map[c]++;
    }

    // Step 2: Use a max heap to store characters by their frequencies
    priority_queue<pair<int, char>> max_heap;
    for (const auto &entry : freq_map)
    {
        max_heap.push({entry.second, entry.first});
    }

    // Step 3: Build the result string
    string result(s.size(), ' ');
    int index = 0;

    while (!max_heap.empty())
    {
        auto [count, ch] = max_heap.top();
        max_heap.pop();

        // Place the most frequent character
        for (int i = 0; i < count; ++i)
        {
            if (index >= s.size())
            {
                index = 1; // Start placing at the odd index
            }
            result[index] = ch;
            index += 2;
        }

        // If placing was not successful (more occurrences than allowed), return ""
        if (index >= s.size() && !max_heap.empty())
        {
            return "";
        }
    }

    return result;
}

int main() {
    string s;
    cin>>s;
    cout<<fashionOrganize(s);
}
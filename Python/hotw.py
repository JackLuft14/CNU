# District Trivia Tuesday hint of the week
import requests, bs4

print("This week's hint of the week:\n")

# Request web page and check
res = requests.get('http://district-trivia.com/what/is-the-hint-of-the-week')
res.raise_for_status()

# Store HTML
soup = bs4.BeautifulSoup(res.text, features="lxml")

# Get all field-items (hint table)
elems = soup.select('.field-items')

# Print second element (Tuesday)
print(elems[1].getText())

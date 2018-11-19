
## Finding Keywords From Turkish News

#### Project Proposal

[KEA](http://www.nzdl.org/Kea/)(Keyphrase Extraction Algorithm) is an algorithm for extracting keyphrases from text documents. It can be either used for free indexing or for indexing with a controlled vocabulary. KEA is implemented in Java and is platform independent. It is an open-source software distributed under the GNU General Public License.
https://github.com/turian/kea-service

Almost every minute news are updating and for reaching what we want, it is necessary to categorize or labeling them automatically. I want to label news automatically according to keyphrases in text to categorize them more specifically. Using kea algorithm it is easy to find to keyword for the text and user can specify the number of key phrases that need to be selected.

####Steps

1. Get data from news sites as categorized way.(To do more specific categorization)
2. Arrange data (with Sentence Detector and Tokenizer)
3. Removing stopwords from the phrase, and then stemming and ordering the remaining words.
4. Training Data for finding the keyphrases of related category. Kea first needs to create a model that learns the extraction strategy from manually indexed documents.









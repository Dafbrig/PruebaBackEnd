const axios = require('axios');
require('dotenv').config();

const API_KEY = process.env.GITHUB_API_KEY;
const USER = 'google';

async function getPopularRepositories() {
  const url = 'https://api.github.com/users/${USER}/repos';
  const headers = {
    Authorization: 'token ${API_KEY}',
    Accept: 'application/vnd.github.v3+json'
  };
  
  const response = await axios.get(url, { headers });
  const repos = response.data;
  const popularRepos = repos.sort((a, b) => b.stargazers_count - a.stargazers_count).slice(0, 10);
  popularRepos.forEach(repo => console.log('${repo.name} - ${repo.stargazers_count} stars'));
}

getPopularRepositories();
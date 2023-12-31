import axios from 'axios';

const http = axios.create({
    baseURL: "http://localhost:9000"
});

export default {

    list() {
        return http.get('/breweries');
    },

    get(breweryId) {
        return http.get(`/breweries/${breweryId}`);
    },

    getBrewers(breweryId){
        return http.get(`/breweries/${breweryId}/brewers`);
    },
    
    getRandomBrewery() {
        return http.get('/breweries/random');
    },

    addBrewery(brewery) {
        return http.post('/breweries', brewery);
    },

    editContact(contact, breweryId) {
        return http.put(`/breweries/${breweryId}/contact`, contact);
    },

    editHours(hours, breweryId) {
        return http.put(`/breweries/${breweryId}/hours`, hours)
    }

}
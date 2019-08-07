const app = require('../server'),
request = require('supertest');

describe('Get/', ()=> {
  it('must say hello', (done)=> {
    request(app)
    .get('/')
    .expect('Content-Type', /html/)
    .expect(200)
    .expect(/Hey/, done)
  });
});
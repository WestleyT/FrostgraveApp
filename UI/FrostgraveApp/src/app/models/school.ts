export class School {
    constructor(
        public id: number,
        public name: string,
        public aligned: string, //make this an array of ints from the backend
        public neutral: string,
        public opposed: string
    ) {}
}

export class Spell {
    constructor(
        public id: number,
        public schoolId: number,
        public name: string,
        public castingNumber: number,
        public category: string,
        public description: string
    ){}
}
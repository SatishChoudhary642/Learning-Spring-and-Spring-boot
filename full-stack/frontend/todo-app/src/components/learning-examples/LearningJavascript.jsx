const person ={
    name: 'Satish',
    age: 21,
    address: {
        area: 'PCMC',
        city: 'Pune',
        country: 'India'
    },
    profiles: ['x.com', 'linkedin', 'GitHub'],
    printProfile: ()=>{
        person.profiles.map(
            (profile)=>{
                console.log(profile)
            }
        )
    }
}


export default function LearningJavascript(){
    return(
        <>
            <div>{person.name}</div>
            <div>{person.address.area}</div>
            <div>{person.profiles[0]}</div>
            <div>{person.printProfile()}</div>
        </>
    )
}
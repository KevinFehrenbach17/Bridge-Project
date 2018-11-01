fetch('/api/states/oh')
	.then(res => res.json())
	.then(data => {
		const body = document.body
		const pageTitle = `<h1>${data.name}</h1>`
		const stateInfo = `<h2>${data.abbreviation}</h2>`
		
		body.innerHTML += pageTitle
		body.stateInfo += stateInfo
	})

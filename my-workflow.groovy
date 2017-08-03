/**
 * Created by SK00447696 on 7/25/17.
 */
when 'TO DO', {
    'FAILURE' should: 'IN PROGRESS'
}

when 'TO DO', {
    'SUCCESS' should: 'IN PROGRESS'
}
when 'IN PROGRESS', {
    'SUCCESS' should: 'DONE'
}

when 'IN PROGRESS', {
    'FAILURE' should: 'TO DO'
}
when 'DONE', {
    'FAILURE' should: 'TO DO'
}

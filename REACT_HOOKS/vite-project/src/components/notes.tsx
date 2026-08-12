import './notes.css'
type NoteProps = {
  text: string,
  priority ?:'high'|'medium'|'low'
}
function Note(props: NoteProps) {
return (
    <div className={'note ${props.priority}'}>
      {props.text}
    </div>
)
}
export default Note;
import java.util.HashMap;
import java.util.Map;

public class Content {

	private final String beginClass = "com.capgemini.gari.entities.collaborativeWs.";

	private String _id;
	private String _class;
	private Map<String, String> labels;
	//private boolean other;

	public Content() {
		super();
	}

	public Content(String _id, String _class, Map<String, String> labels) {
		super();
		this._id = _id;
		this._class = beginClass + _class;
		this.labels = labels;
	}

	public String get_id() {
		return _id;
	}

	public void set_id(int _id) {
		this._id = (this.labels.get("EN").substring(0, 2)).toUpperCase();
	}

	public String get_class() {
		return _class;
	}

	public void set_class(String _class) {
		this._class = beginClass + _class;
	}

	public Map<String, String> getLabels() {
		if (labels == null) {
			labels = new HashMap<>();
		}
		return labels;
	}

	public void setLabels(Map<String, String> labels) {
		this.labels = labels;
	}

	public void addLabel(String key, String value) {
		getLabels().put(key, value);
	}

//	public boolean isOther() {
//		return other;
//	}
//
//	public void setOther(boolean other) {
//		this.other = other;
//	}

}

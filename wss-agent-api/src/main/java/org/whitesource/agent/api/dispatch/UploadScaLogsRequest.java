package org.whitesource.agent.api.dispatch;

import java.io.File;

public class UploadScaLogsRequest extends BaseRequest<UploadScaLogsResult> {

    /* --- Static members --- */

    private static final long serialVersionUID = -6634396300199014567L;

    /* --- Members --- */

    private File logfile;

    /* --- Constructors --- */

    /**
     * Default constructor
     */
    public UploadScaLogsRequest() {
        super(RequestType.UPLOAD_SCA_LOGS);
    }

    /**
     * Constructor
     *
     * @param orgToken       Organization token uniquely identifying the account at white source.
     * @param userKey        user key uniquely identifying the account at white source.
     * @param requesterEmail Email of the WhiteSource user that requests to update WhiteSource.
     */
    public UploadScaLogsRequest(String orgToken, String userKey, String requesterEmail, File file) {
        this();
        this.logfile = file;
        this.orgToken = orgToken;
        this.userKey = userKey;
        this.requesterEmail = requesterEmail;
    }
}

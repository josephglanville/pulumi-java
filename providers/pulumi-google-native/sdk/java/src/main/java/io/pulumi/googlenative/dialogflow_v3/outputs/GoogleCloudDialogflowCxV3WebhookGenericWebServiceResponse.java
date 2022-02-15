// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDialogflowCxV3WebhookGenericWebServiceResponse {
    private final List<String> allowedCaCerts;
    private final String password;
    private final Map<String,String> requestHeaders;
    private final String uri;
    private final String username;

    @OutputCustomType.Constructor({"allowedCaCerts","password","requestHeaders","uri","username"})
    private GoogleCloudDialogflowCxV3WebhookGenericWebServiceResponse(
        List<String> allowedCaCerts,
        String password,
        Map<String,String> requestHeaders,
        String uri,
        String username) {
        this.allowedCaCerts = Objects.requireNonNull(allowedCaCerts);
        this.password = Objects.requireNonNull(password);
        this.requestHeaders = Objects.requireNonNull(requestHeaders);
        this.uri = Objects.requireNonNull(uri);
        this.username = Objects.requireNonNull(username);
    }

    public List<String> getAllowedCaCerts() {
        return this.allowedCaCerts;
    }
    public String getPassword() {
        return this.password;
    }
    public Map<String,String> getRequestHeaders() {
        return this.requestHeaders;
    }
    public String getUri() {
        return this.uri;
    }
    public String getUsername() {
        return this.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3WebhookGenericWebServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> allowedCaCerts;
        private String password;
        private Map<String,String> requestHeaders;
        private String uri;
        private String username;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3WebhookGenericWebServiceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedCaCerts = defaults.allowedCaCerts;
    	      this.password = defaults.password;
    	      this.requestHeaders = defaults.requestHeaders;
    	      this.uri = defaults.uri;
    	      this.username = defaults.username;
        }

        public Builder setAllowedCaCerts(List<String> allowedCaCerts) {
            this.allowedCaCerts = Objects.requireNonNull(allowedCaCerts);
            return this;
        }

        public Builder setPassword(String password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }

        public Builder setRequestHeaders(Map<String,String> requestHeaders) {
            this.requestHeaders = Objects.requireNonNull(requestHeaders);
            return this;
        }

        public Builder setUri(String uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }

        public Builder setUsername(String username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }

        public GoogleCloudDialogflowCxV3WebhookGenericWebServiceResponse build() {
            return new GoogleCloudDialogflowCxV3WebhookGenericWebServiceResponse(allowedCaCerts, password, requestHeaders, uri, username);
        }
    }
}
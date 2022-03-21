// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudbuild_v1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.cloudbuild_v1.inputs.BitbucketServerRepositoryIdResponse;
import io.pulumi.googlenative.cloudbuild_v1.inputs.BitbucketServerSecretsResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * BitbucketServerConfig represents the configuration for a Bitbucket Server.
 * 
 */
public final class BitbucketServerConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final BitbucketServerConfigResponse Empty = new BitbucketServerConfigResponse();

    /**
     * Immutable. API Key that will be attached to webhook. Once this field has been set, it cannot be changed. If you need to change it, please create another BitbucketServerConfig.
     * 
     */
    @Import(name="apiKey", required=true)
      private final String apiKey;

    public String getApiKey() {
        return this.apiKey;
    }

    /**
     * Connected Bitbucket Server repositories for this config.
     * 
     */
    @Import(name="connectedRepositories", required=true)
      private final List<BitbucketServerRepositoryIdResponse> connectedRepositories;

    public List<BitbucketServerRepositoryIdResponse> getConnectedRepositories() {
        return this.connectedRepositories;
    }

    /**
     * Time when the config was created.
     * 
     */
    @Import(name="createTime", required=true)
      private final String createTime;

    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * Immutable. The URI of the Bitbucket Server host. Once this field has been set, it cannot be changed. If you need to change it, please create another BitbucketServerConfig.
     * 
     */
    @Import(name="hostUri", required=true)
      private final String hostUri;

    public String getHostUri() {
        return this.hostUri;
    }

    /**
     * The resource name for the config.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * Optional. The network to be used when reaching out to the Bitbucket Server instance. The VPC network must be enabled for private service connection. This should be set if the Bitbucket Server instance is hosted on-premises and not reachable by public internet. If this field is left empty, no network peering will occur and calls to the Bitbucket Server instance will be made over the public internet. Must be in the format `projects/{project}/global/networks/{network}`, where {project} is a project number or id and {network} is the name of a VPC network in the project.
     * 
     */
    @Import(name="peeredNetwork", required=true)
      private final String peeredNetwork;

    public String getPeeredNetwork() {
        return this.peeredNetwork;
    }

    /**
     * Secret Manager secrets needed by the config.
     * 
     */
    @Import(name="secrets", required=true)
      private final BitbucketServerSecretsResponse secrets;

    public BitbucketServerSecretsResponse getSecrets() {
        return this.secrets;
    }

    /**
     * Optional. SSL certificate to use for requests to Bitbucket Server. The format should be PEM format but the extension can be one of .pem, .cer, or .crt.
     * 
     */
    @Import(name="sslCa", required=true)
      private final String sslCa;

    public String getSslCa() {
        return this.sslCa;
    }

    /**
     * Username of the account Cloud Build will use on Bitbucket Server.
     * 
     */
    @Import(name="username", required=true)
      private final String username;

    public String getUsername() {
        return this.username;
    }

    /**
     * UUID included in webhook requests. The UUID is used to look up the corresponding config.
     * 
     */
    @Import(name="webhookKey", required=true)
      private final String webhookKey;

    public String getWebhookKey() {
        return this.webhookKey;
    }

    public BitbucketServerConfigResponse(
        String apiKey,
        List<BitbucketServerRepositoryIdResponse> connectedRepositories,
        String createTime,
        String hostUri,
        String name,
        String peeredNetwork,
        BitbucketServerSecretsResponse secrets,
        String sslCa,
        String username,
        String webhookKey) {
        this.apiKey = Objects.requireNonNull(apiKey, "expected parameter 'apiKey' to be non-null");
        this.connectedRepositories = Objects.requireNonNull(connectedRepositories, "expected parameter 'connectedRepositories' to be non-null");
        this.createTime = Objects.requireNonNull(createTime, "expected parameter 'createTime' to be non-null");
        this.hostUri = Objects.requireNonNull(hostUri, "expected parameter 'hostUri' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.peeredNetwork = Objects.requireNonNull(peeredNetwork, "expected parameter 'peeredNetwork' to be non-null");
        this.secrets = Objects.requireNonNull(secrets, "expected parameter 'secrets' to be non-null");
        this.sslCa = Objects.requireNonNull(sslCa, "expected parameter 'sslCa' to be non-null");
        this.username = Objects.requireNonNull(username, "expected parameter 'username' to be non-null");
        this.webhookKey = Objects.requireNonNull(webhookKey, "expected parameter 'webhookKey' to be non-null");
    }

    private BitbucketServerConfigResponse() {
        this.apiKey = null;
        this.connectedRepositories = List.of();
        this.createTime = null;
        this.hostUri = null;
        this.name = null;
        this.peeredNetwork = null;
        this.secrets = null;
        this.sslCa = null;
        this.username = null;
        this.webhookKey = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BitbucketServerConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String apiKey;
        private List<BitbucketServerRepositoryIdResponse> connectedRepositories;
        private String createTime;
        private String hostUri;
        private String name;
        private String peeredNetwork;
        private BitbucketServerSecretsResponse secrets;
        private String sslCa;
        private String username;
        private String webhookKey;

        public Builder() {
    	      // Empty
        }

        public Builder(BitbucketServerConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiKey = defaults.apiKey;
    	      this.connectedRepositories = defaults.connectedRepositories;
    	      this.createTime = defaults.createTime;
    	      this.hostUri = defaults.hostUri;
    	      this.name = defaults.name;
    	      this.peeredNetwork = defaults.peeredNetwork;
    	      this.secrets = defaults.secrets;
    	      this.sslCa = defaults.sslCa;
    	      this.username = defaults.username;
    	      this.webhookKey = defaults.webhookKey;
        }

        public Builder apiKey(String apiKey) {
            this.apiKey = Objects.requireNonNull(apiKey);
            return this;
        }
        public Builder connectedRepositories(List<BitbucketServerRepositoryIdResponse> connectedRepositories) {
            this.connectedRepositories = Objects.requireNonNull(connectedRepositories);
            return this;
        }
        public Builder connectedRepositories(BitbucketServerRepositoryIdResponse... connectedRepositories) {
            return connectedRepositories(List.of(connectedRepositories));
        }
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder hostUri(String hostUri) {
            this.hostUri = Objects.requireNonNull(hostUri);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder peeredNetwork(String peeredNetwork) {
            this.peeredNetwork = Objects.requireNonNull(peeredNetwork);
            return this;
        }
        public Builder secrets(BitbucketServerSecretsResponse secrets) {
            this.secrets = Objects.requireNonNull(secrets);
            return this;
        }
        public Builder sslCa(String sslCa) {
            this.sslCa = Objects.requireNonNull(sslCa);
            return this;
        }
        public Builder username(String username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }
        public Builder webhookKey(String webhookKey) {
            this.webhookKey = Objects.requireNonNull(webhookKey);
            return this;
        }        public BitbucketServerConfigResponse build() {
            return new BitbucketServerConfigResponse(apiKey, connectedRepositories, createTime, hostUri, name, peeredNetwork, secrets, sslCa, username, webhookKey);
        }
    }
}

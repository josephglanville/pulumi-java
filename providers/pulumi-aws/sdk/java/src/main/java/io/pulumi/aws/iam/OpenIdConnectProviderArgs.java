// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iam;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OpenIdConnectProviderArgs extends io.pulumi.resources.ResourceArgs {

    public static final OpenIdConnectProviderArgs Empty = new OpenIdConnectProviderArgs();

    /**
     * A list of client IDs (also known as audiences). When a mobile or web app registers with an OpenID Connect provider, they establish a value that identifies the application. (This is the value that's sent as the client_id parameter on OAuth requests.)
     * 
     */
    @Import(name="clientIdLists", required=true)
      private final Output<List<String>> clientIdLists;

    public Output<List<String>> getClientIdLists() {
        return this.clientIdLists;
    }

    /**
     * Map of resource tags for the IAM OIDC provider. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * A list of server certificate thumbprints for the OpenID Connect (OIDC) identity provider's server certificate(s).
     * 
     */
    @Import(name="thumbprintLists", required=true)
      private final Output<List<String>> thumbprintLists;

    public Output<List<String>> getThumbprintLists() {
        return this.thumbprintLists;
    }

    /**
     * The URL of the identity provider. Corresponds to the _iss_ claim.
     * 
     */
    @Import(name="url", required=true)
      private final Output<String> url;

    public Output<String> getUrl() {
        return this.url;
    }

    public OpenIdConnectProviderArgs(
        Output<List<String>> clientIdLists,
        @Nullable Output<Map<String,String>> tags,
        Output<List<String>> thumbprintLists,
        Output<String> url) {
        this.clientIdLists = Objects.requireNonNull(clientIdLists, "expected parameter 'clientIdLists' to be non-null");
        this.tags = tags;
        this.thumbprintLists = Objects.requireNonNull(thumbprintLists, "expected parameter 'thumbprintLists' to be non-null");
        this.url = Objects.requireNonNull(url, "expected parameter 'url' to be non-null");
    }

    private OpenIdConnectProviderArgs() {
        this.clientIdLists = Output.empty();
        this.tags = Output.empty();
        this.thumbprintLists = Output.empty();
        this.url = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OpenIdConnectProviderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<String>> clientIdLists;
        private @Nullable Output<Map<String,String>> tags;
        private Output<List<String>> thumbprintLists;
        private Output<String> url;

        public Builder() {
    	      // Empty
        }

        public Builder(OpenIdConnectProviderArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientIdLists = defaults.clientIdLists;
    	      this.tags = defaults.tags;
    	      this.thumbprintLists = defaults.thumbprintLists;
    	      this.url = defaults.url;
        }

        public Builder clientIdLists(Output<List<String>> clientIdLists) {
            this.clientIdLists = Objects.requireNonNull(clientIdLists);
            return this;
        }
        public Builder clientIdLists(List<String> clientIdLists) {
            this.clientIdLists = Output.of(Objects.requireNonNull(clientIdLists));
            return this;
        }
        public Builder clientIdLists(String... clientIdLists) {
            return clientIdLists(List.of(clientIdLists));
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public Builder thumbprintLists(Output<List<String>> thumbprintLists) {
            this.thumbprintLists = Objects.requireNonNull(thumbprintLists);
            return this;
        }
        public Builder thumbprintLists(List<String> thumbprintLists) {
            this.thumbprintLists = Output.of(Objects.requireNonNull(thumbprintLists));
            return this;
        }
        public Builder thumbprintLists(String... thumbprintLists) {
            return thumbprintLists(List.of(thumbprintLists));
        }
        public Builder url(Output<String> url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }
        public Builder url(String url) {
            this.url = Output.of(Objects.requireNonNull(url));
            return this;
        }        public OpenIdConnectProviderArgs build() {
            return new OpenIdConnectProviderArgs(clientIdLists, tags, thumbprintLists, url);
        }
    }
}
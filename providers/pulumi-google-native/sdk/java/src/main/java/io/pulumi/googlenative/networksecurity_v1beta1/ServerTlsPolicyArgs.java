// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.networksecurity_v1beta1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.networksecurity_v1beta1.inputs.GoogleCloudNetworksecurityV1beta1CertificateProviderArgs;
import io.pulumi.googlenative.networksecurity_v1beta1.inputs.MTLSPolicyArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServerTlsPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServerTlsPolicyArgs Empty = new ServerTlsPolicyArgs();

    /**
     *  Determines if server allows plaintext connections. If set to true, server allows plain text connections. By default, it is set to false. This setting is not exclusive of other encryption modes. For example, if `allow_open` and `mtls_policy` are set, server allows both plain text and mTLS connections. See documentation of other encryption modes to confirm compatibility.
     * 
     */
    @Import(name="allowOpen")
      private final @Nullable Output<Boolean> allowOpen;

    public Output<Boolean> getAllowOpen() {
        return this.allowOpen == null ? Output.empty() : this.allowOpen;
    }

    /**
     * Free-text description of the resource.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * Set of label tags associated with the resource.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> getLabels() {
        return this.labels == null ? Output.empty() : this.labels;
    }

    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     *  Defines a mechanism to provision peer validation certificates for peer to peer authentication (Mutual TLS - mTLS). If not specified, client certificate will not be requested. The connection is treated as TLS and not mTLS. If `allow_open` and `mtls_policy` are set, server allows both plain text and mTLS connections.
     * 
     */
    @Import(name="mtlsPolicy")
      private final @Nullable Output<MTLSPolicyArgs> mtlsPolicy;

    public Output<MTLSPolicyArgs> getMtlsPolicy() {
        return this.mtlsPolicy == null ? Output.empty() : this.mtlsPolicy;
    }

    /**
     * Name of the ServerTlsPolicy resource. It matches the pattern `projects/*{@literal /}locations/{location}/serverTlsPolicies/{server_tls_policy}`
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    /**
     *  Defines a mechanism to provision server identity (public and private keys). Cannot be combined with `allow_open` as a permissive mode that allows both plain text and TLS is not supported.
     * 
     */
    @Import(name="serverCertificate")
      private final @Nullable Output<GoogleCloudNetworksecurityV1beta1CertificateProviderArgs> serverCertificate;

    public Output<GoogleCloudNetworksecurityV1beta1CertificateProviderArgs> getServerCertificate() {
        return this.serverCertificate == null ? Output.empty() : this.serverCertificate;
    }

    @Import(name="serverTlsPolicyId", required=true)
      private final Output<String> serverTlsPolicyId;

    public Output<String> getServerTlsPolicyId() {
        return this.serverTlsPolicyId;
    }

    public ServerTlsPolicyArgs(
        @Nullable Output<Boolean> allowOpen,
        @Nullable Output<String> description,
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<String> location,
        @Nullable Output<MTLSPolicyArgs> mtlsPolicy,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        @Nullable Output<GoogleCloudNetworksecurityV1beta1CertificateProviderArgs> serverCertificate,
        Output<String> serverTlsPolicyId) {
        this.allowOpen = allowOpen;
        this.description = description;
        this.labels = labels;
        this.location = location;
        this.mtlsPolicy = mtlsPolicy;
        this.name = name;
        this.project = project;
        this.serverCertificate = serverCertificate;
        this.serverTlsPolicyId = Objects.requireNonNull(serverTlsPolicyId, "expected parameter 'serverTlsPolicyId' to be non-null");
    }

    private ServerTlsPolicyArgs() {
        this.allowOpen = Output.empty();
        this.description = Output.empty();
        this.labels = Output.empty();
        this.location = Output.empty();
        this.mtlsPolicy = Output.empty();
        this.name = Output.empty();
        this.project = Output.empty();
        this.serverCertificate = Output.empty();
        this.serverTlsPolicyId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServerTlsPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> allowOpen;
        private @Nullable Output<String> description;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<String> location;
        private @Nullable Output<MTLSPolicyArgs> mtlsPolicy;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private @Nullable Output<GoogleCloudNetworksecurityV1beta1CertificateProviderArgs> serverCertificate;
        private Output<String> serverTlsPolicyId;

        public Builder() {
    	      // Empty
        }

        public Builder(ServerTlsPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowOpen = defaults.allowOpen;
    	      this.description = defaults.description;
    	      this.labels = defaults.labels;
    	      this.location = defaults.location;
    	      this.mtlsPolicy = defaults.mtlsPolicy;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.serverCertificate = defaults.serverCertificate;
    	      this.serverTlsPolicyId = defaults.serverTlsPolicyId;
        }

        public Builder allowOpen(@Nullable Output<Boolean> allowOpen) {
            this.allowOpen = allowOpen;
            return this;
        }
        public Builder allowOpen(@Nullable Boolean allowOpen) {
            this.allowOpen = Output.ofNullable(allowOpen);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Output.ofNullable(labels);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
            return this;
        }
        public Builder mtlsPolicy(@Nullable Output<MTLSPolicyArgs> mtlsPolicy) {
            this.mtlsPolicy = mtlsPolicy;
            return this;
        }
        public Builder mtlsPolicy(@Nullable MTLSPolicyArgs mtlsPolicy) {
            this.mtlsPolicy = Output.ofNullable(mtlsPolicy);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }
        public Builder serverCertificate(@Nullable Output<GoogleCloudNetworksecurityV1beta1CertificateProviderArgs> serverCertificate) {
            this.serverCertificate = serverCertificate;
            return this;
        }
        public Builder serverCertificate(@Nullable GoogleCloudNetworksecurityV1beta1CertificateProviderArgs serverCertificate) {
            this.serverCertificate = Output.ofNullable(serverCertificate);
            return this;
        }
        public Builder serverTlsPolicyId(Output<String> serverTlsPolicyId) {
            this.serverTlsPolicyId = Objects.requireNonNull(serverTlsPolicyId);
            return this;
        }
        public Builder serverTlsPolicyId(String serverTlsPolicyId) {
            this.serverTlsPolicyId = Output.of(Objects.requireNonNull(serverTlsPolicyId));
            return this;
        }        public ServerTlsPolicyArgs build() {
            return new ServerTlsPolicyArgs(allowOpen, description, labels, location, mtlsPolicy, name, project, serverCertificate, serverTlsPolicyId);
        }
    }
}

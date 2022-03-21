// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.activedirectory.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DomainTrustState extends io.pulumi.resources.ResourceArgs {

    public static final DomainTrustState Empty = new DomainTrustState();

    /**
     * The fully qualified domain name. e.g. mydomain.myorganization.com, with the restrictions,
     * https://cloud.google.com/managed-microsoft-ad/reference/rest/v1/projects.locations.global.domains.
     * 
     */
    @Import(name="domain")
      private final @Nullable Output<String> domain;

    public Output<String> getDomain() {
        return this.domain == null ? Output.empty() : this.domain;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    /**
     * Whether the trusted side has forest/domain wide access or selective access to an approved set of resources.
     * 
     */
    @Import(name="selectiveAuthentication")
      private final @Nullable Output<Boolean> selectiveAuthentication;

    public Output<Boolean> getSelectiveAuthentication() {
        return this.selectiveAuthentication == null ? Output.empty() : this.selectiveAuthentication;
    }

    /**
     * The target DNS server IP addresses which can resolve the remote domain involved in the trust.
     * 
     */
    @Import(name="targetDnsIpAddresses")
      private final @Nullable Output<List<String>> targetDnsIpAddresses;

    public Output<List<String>> getTargetDnsIpAddresses() {
        return this.targetDnsIpAddresses == null ? Output.empty() : this.targetDnsIpAddresses;
    }

    /**
     * The fully qualified target domain name which will be in trust with the current domain.
     * 
     */
    @Import(name="targetDomainName")
      private final @Nullable Output<String> targetDomainName;

    public Output<String> getTargetDomainName() {
        return this.targetDomainName == null ? Output.empty() : this.targetDomainName;
    }

    /**
     * The trust direction, which decides if the current domain is trusted, trusting, or both.
     * Possible values are `INBOUND`, `OUTBOUND`, and `BIDIRECTIONAL`.
     * 
     */
    @Import(name="trustDirection")
      private final @Nullable Output<String> trustDirection;

    public Output<String> getTrustDirection() {
        return this.trustDirection == null ? Output.empty() : this.trustDirection;
    }

    /**
     * The trust secret used for the handshake with the target domain. This will not be stored.
     * **Note**: This property is sensitive and will not be displayed in the plan.
     * 
     */
    @Import(name="trustHandshakeSecret")
      private final @Nullable Output<String> trustHandshakeSecret;

    public Output<String> getTrustHandshakeSecret() {
        return this.trustHandshakeSecret == null ? Output.empty() : this.trustHandshakeSecret;
    }

    /**
     * The type of trust represented by the trust resource.
     * Possible values are `FOREST` and `EXTERNAL`.
     * 
     */
    @Import(name="trustType")
      private final @Nullable Output<String> trustType;

    public Output<String> getTrustType() {
        return this.trustType == null ? Output.empty() : this.trustType;
    }

    public DomainTrustState(
        @Nullable Output<String> domain,
        @Nullable Output<String> project,
        @Nullable Output<Boolean> selectiveAuthentication,
        @Nullable Output<List<String>> targetDnsIpAddresses,
        @Nullable Output<String> targetDomainName,
        @Nullable Output<String> trustDirection,
        @Nullable Output<String> trustHandshakeSecret,
        @Nullable Output<String> trustType) {
        this.domain = domain;
        this.project = project;
        this.selectiveAuthentication = selectiveAuthentication;
        this.targetDnsIpAddresses = targetDnsIpAddresses;
        this.targetDomainName = targetDomainName;
        this.trustDirection = trustDirection;
        this.trustHandshakeSecret = trustHandshakeSecret;
        this.trustType = trustType;
    }

    private DomainTrustState() {
        this.domain = Output.empty();
        this.project = Output.empty();
        this.selectiveAuthentication = Output.empty();
        this.targetDnsIpAddresses = Output.empty();
        this.targetDomainName = Output.empty();
        this.trustDirection = Output.empty();
        this.trustHandshakeSecret = Output.empty();
        this.trustType = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainTrustState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> domain;
        private @Nullable Output<String> project;
        private @Nullable Output<Boolean> selectiveAuthentication;
        private @Nullable Output<List<String>> targetDnsIpAddresses;
        private @Nullable Output<String> targetDomainName;
        private @Nullable Output<String> trustDirection;
        private @Nullable Output<String> trustHandshakeSecret;
        private @Nullable Output<String> trustType;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainTrustState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domain = defaults.domain;
    	      this.project = defaults.project;
    	      this.selectiveAuthentication = defaults.selectiveAuthentication;
    	      this.targetDnsIpAddresses = defaults.targetDnsIpAddresses;
    	      this.targetDomainName = defaults.targetDomainName;
    	      this.trustDirection = defaults.trustDirection;
    	      this.trustHandshakeSecret = defaults.trustHandshakeSecret;
    	      this.trustType = defaults.trustType;
        }

        public Builder domain(@Nullable Output<String> domain) {
            this.domain = domain;
            return this;
        }
        public Builder domain(@Nullable String domain) {
            this.domain = Output.ofNullable(domain);
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
        public Builder selectiveAuthentication(@Nullable Output<Boolean> selectiveAuthentication) {
            this.selectiveAuthentication = selectiveAuthentication;
            return this;
        }
        public Builder selectiveAuthentication(@Nullable Boolean selectiveAuthentication) {
            this.selectiveAuthentication = Output.ofNullable(selectiveAuthentication);
            return this;
        }
        public Builder targetDnsIpAddresses(@Nullable Output<List<String>> targetDnsIpAddresses) {
            this.targetDnsIpAddresses = targetDnsIpAddresses;
            return this;
        }
        public Builder targetDnsIpAddresses(@Nullable List<String> targetDnsIpAddresses) {
            this.targetDnsIpAddresses = Output.ofNullable(targetDnsIpAddresses);
            return this;
        }
        public Builder targetDnsIpAddresses(String... targetDnsIpAddresses) {
            return targetDnsIpAddresses(List.of(targetDnsIpAddresses));
        }
        public Builder targetDomainName(@Nullable Output<String> targetDomainName) {
            this.targetDomainName = targetDomainName;
            return this;
        }
        public Builder targetDomainName(@Nullable String targetDomainName) {
            this.targetDomainName = Output.ofNullable(targetDomainName);
            return this;
        }
        public Builder trustDirection(@Nullable Output<String> trustDirection) {
            this.trustDirection = trustDirection;
            return this;
        }
        public Builder trustDirection(@Nullable String trustDirection) {
            this.trustDirection = Output.ofNullable(trustDirection);
            return this;
        }
        public Builder trustHandshakeSecret(@Nullable Output<String> trustHandshakeSecret) {
            this.trustHandshakeSecret = trustHandshakeSecret;
            return this;
        }
        public Builder trustHandshakeSecret(@Nullable String trustHandshakeSecret) {
            this.trustHandshakeSecret = Output.ofNullable(trustHandshakeSecret);
            return this;
        }
        public Builder trustType(@Nullable Output<String> trustType) {
            this.trustType = trustType;
            return this;
        }
        public Builder trustType(@Nullable String trustType) {
            this.trustType = Output.ofNullable(trustType);
            return this;
        }        public DomainTrustState build() {
            return new DomainTrustState(domain, project, selectiveAuthentication, targetDnsIpAddresses, targetDomainName, trustDirection, trustHandshakeSecret, trustType);
        }
    }
}

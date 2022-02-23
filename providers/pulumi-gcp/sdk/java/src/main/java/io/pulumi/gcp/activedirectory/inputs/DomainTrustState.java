// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.activedirectory.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
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
    @InputImport(name="domain")
      private final @Nullable Input<String> domain;

    public Input<String> getDomain() {
        return this.domain == null ? Input.empty() : this.domain;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * Whether the trusted side has forest/domain wide access or selective access to an approved set of resources.
     * 
     */
    @InputImport(name="selectiveAuthentication")
      private final @Nullable Input<Boolean> selectiveAuthentication;

    public Input<Boolean> getSelectiveAuthentication() {
        return this.selectiveAuthentication == null ? Input.empty() : this.selectiveAuthentication;
    }

    /**
     * The target DNS server IP addresses which can resolve the remote domain involved in the trust.
     * 
     */
    @InputImport(name="targetDnsIpAddresses")
      private final @Nullable Input<List<String>> targetDnsIpAddresses;

    public Input<List<String>> getTargetDnsIpAddresses() {
        return this.targetDnsIpAddresses == null ? Input.empty() : this.targetDnsIpAddresses;
    }

    /**
     * The fully qualified target domain name which will be in trust with the current domain.
     * 
     */
    @InputImport(name="targetDomainName")
      private final @Nullable Input<String> targetDomainName;

    public Input<String> getTargetDomainName() {
        return this.targetDomainName == null ? Input.empty() : this.targetDomainName;
    }

    /**
     * The trust direction, which decides if the current domain is trusted, trusting, or both.
     * Possible values are `INBOUND`, `OUTBOUND`, and `BIDIRECTIONAL`.
     * 
     */
    @InputImport(name="trustDirection")
      private final @Nullable Input<String> trustDirection;

    public Input<String> getTrustDirection() {
        return this.trustDirection == null ? Input.empty() : this.trustDirection;
    }

    /**
     * The trust secret used for the handshake with the target domain. This will not be stored.
     * **Note**: This property is sensitive and will not be displayed in the plan.
     * 
     */
    @InputImport(name="trustHandshakeSecret")
      private final @Nullable Input<String> trustHandshakeSecret;

    public Input<String> getTrustHandshakeSecret() {
        return this.trustHandshakeSecret == null ? Input.empty() : this.trustHandshakeSecret;
    }

    /**
     * The type of trust represented by the trust resource.
     * Possible values are `FOREST` and `EXTERNAL`.
     * 
     */
    @InputImport(name="trustType")
      private final @Nullable Input<String> trustType;

    public Input<String> getTrustType() {
        return this.trustType == null ? Input.empty() : this.trustType;
    }

    public DomainTrustState(
        @Nullable Input<String> domain,
        @Nullable Input<String> project,
        @Nullable Input<Boolean> selectiveAuthentication,
        @Nullable Input<List<String>> targetDnsIpAddresses,
        @Nullable Input<String> targetDomainName,
        @Nullable Input<String> trustDirection,
        @Nullable Input<String> trustHandshakeSecret,
        @Nullable Input<String> trustType) {
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
        this.domain = Input.empty();
        this.project = Input.empty();
        this.selectiveAuthentication = Input.empty();
        this.targetDnsIpAddresses = Input.empty();
        this.targetDomainName = Input.empty();
        this.trustDirection = Input.empty();
        this.trustHandshakeSecret = Input.empty();
        this.trustType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainTrustState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> domain;
        private @Nullable Input<String> project;
        private @Nullable Input<Boolean> selectiveAuthentication;
        private @Nullable Input<List<String>> targetDnsIpAddresses;
        private @Nullable Input<String> targetDomainName;
        private @Nullable Input<String> trustDirection;
        private @Nullable Input<String> trustHandshakeSecret;
        private @Nullable Input<String> trustType;

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

        public Builder setDomain(@Nullable Input<String> domain) {
            this.domain = domain;
            return this;
        }

        public Builder setDomain(@Nullable String domain) {
            this.domain = Input.ofNullable(domain);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setSelectiveAuthentication(@Nullable Input<Boolean> selectiveAuthentication) {
            this.selectiveAuthentication = selectiveAuthentication;
            return this;
        }

        public Builder setSelectiveAuthentication(@Nullable Boolean selectiveAuthentication) {
            this.selectiveAuthentication = Input.ofNullable(selectiveAuthentication);
            return this;
        }

        public Builder setTargetDnsIpAddresses(@Nullable Input<List<String>> targetDnsIpAddresses) {
            this.targetDnsIpAddresses = targetDnsIpAddresses;
            return this;
        }

        public Builder setTargetDnsIpAddresses(@Nullable List<String> targetDnsIpAddresses) {
            this.targetDnsIpAddresses = Input.ofNullable(targetDnsIpAddresses);
            return this;
        }

        public Builder setTargetDomainName(@Nullable Input<String> targetDomainName) {
            this.targetDomainName = targetDomainName;
            return this;
        }

        public Builder setTargetDomainName(@Nullable String targetDomainName) {
            this.targetDomainName = Input.ofNullable(targetDomainName);
            return this;
        }

        public Builder setTrustDirection(@Nullable Input<String> trustDirection) {
            this.trustDirection = trustDirection;
            return this;
        }

        public Builder setTrustDirection(@Nullable String trustDirection) {
            this.trustDirection = Input.ofNullable(trustDirection);
            return this;
        }

        public Builder setTrustHandshakeSecret(@Nullable Input<String> trustHandshakeSecret) {
            this.trustHandshakeSecret = trustHandshakeSecret;
            return this;
        }

        public Builder setTrustHandshakeSecret(@Nullable String trustHandshakeSecret) {
            this.trustHandshakeSecret = Input.ofNullable(trustHandshakeSecret);
            return this;
        }

        public Builder setTrustType(@Nullable Input<String> trustType) {
            this.trustType = trustType;
            return this;
        }

        public Builder setTrustType(@Nullable String trustType) {
            this.trustType = Input.ofNullable(trustType);
            return this;
        }
        public DomainTrustState build() {
            return new DomainTrustState(domain, project, selectiveAuthentication, targetDnsIpAddresses, targetDomainName, trustDirection, trustHandshakeSecret, trustType);
        }
    }
}

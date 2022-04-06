// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appsync;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class DomainNameApiAssociationArgs extends io.pulumi.resources.ResourceArgs {

    public static final DomainNameApiAssociationArgs Empty = new DomainNameApiAssociationArgs();

    /**
     * The API ID.
     * 
     */
    @Import(name="apiId", required=true)
      private final Output<String> apiId;

    public Output<String> getApiId() {
        return this.apiId;
    }

    /**
     * The Appsync domain name.
     * 
     */
    @Import(name="domainName", required=true)
      private final Output<String> domainName;

    public Output<String> getDomainName() {
        return this.domainName;
    }

    public DomainNameApiAssociationArgs(
        Output<String> apiId,
        Output<String> domainName) {
        this.apiId = Objects.requireNonNull(apiId, "expected parameter 'apiId' to be non-null");
        this.domainName = Objects.requireNonNull(domainName, "expected parameter 'domainName' to be non-null");
    }

    private DomainNameApiAssociationArgs() {
        this.apiId = Output.empty();
        this.domainName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainNameApiAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> apiId;
        private Output<String> domainName;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainNameApiAssociationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiId = defaults.apiId;
    	      this.domainName = defaults.domainName;
        }

        public Builder apiId(Output<String> apiId) {
            this.apiId = Objects.requireNonNull(apiId);
            return this;
        }
        public Builder apiId(String apiId) {
            this.apiId = Output.of(Objects.requireNonNull(apiId));
            return this;
        }
        public Builder domainName(Output<String> domainName) {
            this.domainName = Objects.requireNonNull(domainName);
            return this;
        }
        public Builder domainName(String domainName) {
            this.domainName = Output.of(Objects.requireNonNull(domainName));
            return this;
        }        public DomainNameApiAssociationArgs build() {
            return new DomainNameApiAssociationArgs(apiId, domainName);
        }
    }
}
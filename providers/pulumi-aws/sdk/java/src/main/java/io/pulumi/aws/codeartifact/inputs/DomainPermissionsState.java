// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codeartifact.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DomainPermissionsState extends io.pulumi.resources.ResourceArgs {

    public static final DomainPermissionsState Empty = new DomainPermissionsState();

    /**
     * The name of the domain on which to set the resource policy.
     * 
     */
    @Import(name="domain")
      private final @Nullable Output<String> domain;

    public Output<String> getDomain() {
        return this.domain == null ? Output.empty() : this.domain;
    }

    /**
     * The account number of the AWS account that owns the domain.
     * 
     */
    @Import(name="domainOwner")
      private final @Nullable Output<String> domainOwner;

    public Output<String> getDomainOwner() {
        return this.domainOwner == null ? Output.empty() : this.domainOwner;
    }

    /**
     * A JSON policy string to be set as the access control resource policy on the provided domain.
     * 
     */
    @Import(name="policyDocument")
      private final @Nullable Output<String> policyDocument;

    public Output<String> getPolicyDocument() {
        return this.policyDocument == null ? Output.empty() : this.policyDocument;
    }

    /**
     * The current revision of the resource policy to be set. This revision is used for optimistic locking, which prevents others from overwriting your changes to the domain's resource policy.
     * 
     */
    @Import(name="policyRevision")
      private final @Nullable Output<String> policyRevision;

    public Output<String> getPolicyRevision() {
        return this.policyRevision == null ? Output.empty() : this.policyRevision;
    }

    /**
     * The ARN of the resource associated with the resource policy.
     * 
     */
    @Import(name="resourceArn")
      private final @Nullable Output<String> resourceArn;

    public Output<String> getResourceArn() {
        return this.resourceArn == null ? Output.empty() : this.resourceArn;
    }

    public DomainPermissionsState(
        @Nullable Output<String> domain,
        @Nullable Output<String> domainOwner,
        @Nullable Output<String> policyDocument,
        @Nullable Output<String> policyRevision,
        @Nullable Output<String> resourceArn) {
        this.domain = domain;
        this.domainOwner = domainOwner;
        this.policyDocument = policyDocument;
        this.policyRevision = policyRevision;
        this.resourceArn = resourceArn;
    }

    private DomainPermissionsState() {
        this.domain = Output.empty();
        this.domainOwner = Output.empty();
        this.policyDocument = Output.empty();
        this.policyRevision = Output.empty();
        this.resourceArn = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainPermissionsState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> domain;
        private @Nullable Output<String> domainOwner;
        private @Nullable Output<String> policyDocument;
        private @Nullable Output<String> policyRevision;
        private @Nullable Output<String> resourceArn;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainPermissionsState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domain = defaults.domain;
    	      this.domainOwner = defaults.domainOwner;
    	      this.policyDocument = defaults.policyDocument;
    	      this.policyRevision = defaults.policyRevision;
    	      this.resourceArn = defaults.resourceArn;
        }

        public Builder domain(@Nullable Output<String> domain) {
            this.domain = domain;
            return this;
        }
        public Builder domain(@Nullable String domain) {
            this.domain = Output.ofNullable(domain);
            return this;
        }
        public Builder domainOwner(@Nullable Output<String> domainOwner) {
            this.domainOwner = domainOwner;
            return this;
        }
        public Builder domainOwner(@Nullable String domainOwner) {
            this.domainOwner = Output.ofNullable(domainOwner);
            return this;
        }
        public Builder policyDocument(@Nullable Output<String> policyDocument) {
            this.policyDocument = policyDocument;
            return this;
        }
        public Builder policyDocument(@Nullable String policyDocument) {
            this.policyDocument = Output.ofNullable(policyDocument);
            return this;
        }
        public Builder policyRevision(@Nullable Output<String> policyRevision) {
            this.policyRevision = policyRevision;
            return this;
        }
        public Builder policyRevision(@Nullable String policyRevision) {
            this.policyRevision = Output.ofNullable(policyRevision);
            return this;
        }
        public Builder resourceArn(@Nullable Output<String> resourceArn) {
            this.resourceArn = resourceArn;
            return this;
        }
        public Builder resourceArn(@Nullable String resourceArn) {
            this.resourceArn = Output.ofNullable(resourceArn);
            return this;
        }        public DomainPermissionsState build() {
            return new DomainPermissionsState(domain, domainOwner, policyDocument, policyRevision, resourceArn);
        }
    }
}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codeartifact.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RepositoryPermissionsPolicyState extends io.pulumi.resources.ResourceArgs {

    public static final RepositoryPermissionsPolicyState Empty = new RepositoryPermissionsPolicyState();

    /**
     * The name of the domain on which to set the resource policy.
     * 
     */
    @Import(name="domain")
      private final @Nullable Output<String> domain;

    public Output<String> getDomain() {
        return this.domain == null ? Codegen.empty() : this.domain;
    }

    /**
     * The account number of the AWS account that owns the domain.
     * 
     */
    @Import(name="domainOwner")
      private final @Nullable Output<String> domainOwner;

    public Output<String> getDomainOwner() {
        return this.domainOwner == null ? Codegen.empty() : this.domainOwner;
    }

    /**
     * A JSON policy string to be set as the access control resource policy on the provided domain.
     * 
     */
    @Import(name="policyDocument")
      private final @Nullable Output<String> policyDocument;

    public Output<String> getPolicyDocument() {
        return this.policyDocument == null ? Codegen.empty() : this.policyDocument;
    }

    /**
     * The current revision of the resource policy to be set. This revision is used for optimistic locking, which prevents others from overwriting your changes to the domain's resource policy.
     * 
     */
    @Import(name="policyRevision")
      private final @Nullable Output<String> policyRevision;

    public Output<String> getPolicyRevision() {
        return this.policyRevision == null ? Codegen.empty() : this.policyRevision;
    }

    /**
     * The name of the repository to set the resource policy on.
     * 
     */
    @Import(name="repository")
      private final @Nullable Output<String> repository;

    public Output<String> getRepository() {
        return this.repository == null ? Codegen.empty() : this.repository;
    }

    /**
     * The ARN of the resource associated with the resource policy.
     * 
     */
    @Import(name="resourceArn")
      private final @Nullable Output<String> resourceArn;

    public Output<String> getResourceArn() {
        return this.resourceArn == null ? Codegen.empty() : this.resourceArn;
    }

    public RepositoryPermissionsPolicyState(
        @Nullable Output<String> domain,
        @Nullable Output<String> domainOwner,
        @Nullable Output<String> policyDocument,
        @Nullable Output<String> policyRevision,
        @Nullable Output<String> repository,
        @Nullable Output<String> resourceArn) {
        this.domain = domain;
        this.domainOwner = domainOwner;
        this.policyDocument = policyDocument;
        this.policyRevision = policyRevision;
        this.repository = repository;
        this.resourceArn = resourceArn;
    }

    private RepositoryPermissionsPolicyState() {
        this.domain = Codegen.empty();
        this.domainOwner = Codegen.empty();
        this.policyDocument = Codegen.empty();
        this.policyRevision = Codegen.empty();
        this.repository = Codegen.empty();
        this.resourceArn = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RepositoryPermissionsPolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> domain;
        private @Nullable Output<String> domainOwner;
        private @Nullable Output<String> policyDocument;
        private @Nullable Output<String> policyRevision;
        private @Nullable Output<String> repository;
        private @Nullable Output<String> resourceArn;

        public Builder() {
    	      // Empty
        }

        public Builder(RepositoryPermissionsPolicyState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domain = defaults.domain;
    	      this.domainOwner = defaults.domainOwner;
    	      this.policyDocument = defaults.policyDocument;
    	      this.policyRevision = defaults.policyRevision;
    	      this.repository = defaults.repository;
    	      this.resourceArn = defaults.resourceArn;
        }

        public Builder domain(@Nullable Output<String> domain) {
            this.domain = domain;
            return this;
        }
        public Builder domain(@Nullable String domain) {
            this.domain = Codegen.ofNullable(domain);
            return this;
        }
        public Builder domainOwner(@Nullable Output<String> domainOwner) {
            this.domainOwner = domainOwner;
            return this;
        }
        public Builder domainOwner(@Nullable String domainOwner) {
            this.domainOwner = Codegen.ofNullable(domainOwner);
            return this;
        }
        public Builder policyDocument(@Nullable Output<String> policyDocument) {
            this.policyDocument = policyDocument;
            return this;
        }
        public Builder policyDocument(@Nullable String policyDocument) {
            this.policyDocument = Codegen.ofNullable(policyDocument);
            return this;
        }
        public Builder policyRevision(@Nullable Output<String> policyRevision) {
            this.policyRevision = policyRevision;
            return this;
        }
        public Builder policyRevision(@Nullable String policyRevision) {
            this.policyRevision = Codegen.ofNullable(policyRevision);
            return this;
        }
        public Builder repository(@Nullable Output<String> repository) {
            this.repository = repository;
            return this;
        }
        public Builder repository(@Nullable String repository) {
            this.repository = Codegen.ofNullable(repository);
            return this;
        }
        public Builder resourceArn(@Nullable Output<String> resourceArn) {
            this.resourceArn = resourceArn;
            return this;
        }
        public Builder resourceArn(@Nullable String resourceArn) {
            this.resourceArn = Codegen.ofNullable(resourceArn);
            return this;
        }        public RepositoryPermissionsPolicyState build() {
            return new RepositoryPermissionsPolicyState(domain, domainOwner, policyDocument, policyRevision, repository, resourceArn);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.compute_alpha.inputs.PublicDelegatedPrefixPublicDelegatedSubPrefixArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PublicDelegatedPrefixArgs extends io.pulumi.resources.ResourceArgs {

    public static final PublicDelegatedPrefixArgs Empty = new PublicDelegatedPrefixArgs();

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * The IPv4 address range, in CIDR format, represented by this public delegated prefix.
     * 
     */
    @Import(name="ipCidrRange")
      private final @Nullable Output<String> ipCidrRange;

    public Output<String> getIpCidrRange() {
        return this.ipCidrRange == null ? Output.empty() : this.ipCidrRange;
    }

    /**
     * If true, the prefix will be live migrated.
     * 
     */
    @Import(name="isLiveMigration")
      private final @Nullable Output<Boolean> isLiveMigration;

    public Output<Boolean> getIsLiveMigration() {
        return this.isLiveMigration == null ? Output.empty() : this.isLiveMigration;
    }

    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * The URL of parent prefix. Either PublicAdvertisedPrefix or PublicDelegatedPrefix.
     * 
     */
    @Import(name="parentPrefix")
      private final @Nullable Output<String> parentPrefix;

    public Output<String> getParentPrefix() {
        return this.parentPrefix == null ? Output.empty() : this.parentPrefix;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    /**
     * The list of sub public delegated prefixes that exist for this public delegated prefix.
     * 
     */
    @Import(name="publicDelegatedSubPrefixs")
      private final @Nullable Output<List<PublicDelegatedPrefixPublicDelegatedSubPrefixArgs>> publicDelegatedSubPrefixs;

    public Output<List<PublicDelegatedPrefixPublicDelegatedSubPrefixArgs>> getPublicDelegatedSubPrefixs() {
        return this.publicDelegatedSubPrefixs == null ? Output.empty() : this.publicDelegatedSubPrefixs;
    }

    @Import(name="region", required=true)
      private final Output<String> region;

    public Output<String> getRegion() {
        return this.region;
    }

    @Import(name="requestId")
      private final @Nullable Output<String> requestId;

    public Output<String> getRequestId() {
        return this.requestId == null ? Output.empty() : this.requestId;
    }

    public PublicDelegatedPrefixArgs(
        @Nullable Output<String> description,
        @Nullable Output<String> ipCidrRange,
        @Nullable Output<Boolean> isLiveMigration,
        @Nullable Output<String> name,
        @Nullable Output<String> parentPrefix,
        @Nullable Output<String> project,
        @Nullable Output<List<PublicDelegatedPrefixPublicDelegatedSubPrefixArgs>> publicDelegatedSubPrefixs,
        Output<String> region,
        @Nullable Output<String> requestId) {
        this.description = description;
        this.ipCidrRange = ipCidrRange;
        this.isLiveMigration = isLiveMigration;
        this.name = name;
        this.parentPrefix = parentPrefix;
        this.project = project;
        this.publicDelegatedSubPrefixs = publicDelegatedSubPrefixs;
        this.region = Objects.requireNonNull(region, "expected parameter 'region' to be non-null");
        this.requestId = requestId;
    }

    private PublicDelegatedPrefixArgs() {
        this.description = Output.empty();
        this.ipCidrRange = Output.empty();
        this.isLiveMigration = Output.empty();
        this.name = Output.empty();
        this.parentPrefix = Output.empty();
        this.project = Output.empty();
        this.publicDelegatedSubPrefixs = Output.empty();
        this.region = Output.empty();
        this.requestId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PublicDelegatedPrefixArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<String> ipCidrRange;
        private @Nullable Output<Boolean> isLiveMigration;
        private @Nullable Output<String> name;
        private @Nullable Output<String> parentPrefix;
        private @Nullable Output<String> project;
        private @Nullable Output<List<PublicDelegatedPrefixPublicDelegatedSubPrefixArgs>> publicDelegatedSubPrefixs;
        private Output<String> region;
        private @Nullable Output<String> requestId;

        public Builder() {
    	      // Empty
        }

        public Builder(PublicDelegatedPrefixArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.ipCidrRange = defaults.ipCidrRange;
    	      this.isLiveMigration = defaults.isLiveMigration;
    	      this.name = defaults.name;
    	      this.parentPrefix = defaults.parentPrefix;
    	      this.project = defaults.project;
    	      this.publicDelegatedSubPrefixs = defaults.publicDelegatedSubPrefixs;
    	      this.region = defaults.region;
    	      this.requestId = defaults.requestId;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }
        public Builder ipCidrRange(@Nullable Output<String> ipCidrRange) {
            this.ipCidrRange = ipCidrRange;
            return this;
        }
        public Builder ipCidrRange(@Nullable String ipCidrRange) {
            this.ipCidrRange = Output.ofNullable(ipCidrRange);
            return this;
        }
        public Builder isLiveMigration(@Nullable Output<Boolean> isLiveMigration) {
            this.isLiveMigration = isLiveMigration;
            return this;
        }
        public Builder isLiveMigration(@Nullable Boolean isLiveMigration) {
            this.isLiveMigration = Output.ofNullable(isLiveMigration);
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
        public Builder parentPrefix(@Nullable Output<String> parentPrefix) {
            this.parentPrefix = parentPrefix;
            return this;
        }
        public Builder parentPrefix(@Nullable String parentPrefix) {
            this.parentPrefix = Output.ofNullable(parentPrefix);
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
        public Builder publicDelegatedSubPrefixs(@Nullable Output<List<PublicDelegatedPrefixPublicDelegatedSubPrefixArgs>> publicDelegatedSubPrefixs) {
            this.publicDelegatedSubPrefixs = publicDelegatedSubPrefixs;
            return this;
        }
        public Builder publicDelegatedSubPrefixs(@Nullable List<PublicDelegatedPrefixPublicDelegatedSubPrefixArgs> publicDelegatedSubPrefixs) {
            this.publicDelegatedSubPrefixs = Output.ofNullable(publicDelegatedSubPrefixs);
            return this;
        }
        public Builder publicDelegatedSubPrefixs(PublicDelegatedPrefixPublicDelegatedSubPrefixArgs... publicDelegatedSubPrefixs) {
            return publicDelegatedSubPrefixs(List.of(publicDelegatedSubPrefixs));
        }
        public Builder region(Output<String> region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }
        public Builder region(String region) {
            this.region = Output.of(Objects.requireNonNull(region));
            return this;
        }
        public Builder requestId(@Nullable Output<String> requestId) {
            this.requestId = requestId;
            return this;
        }
        public Builder requestId(@Nullable String requestId) {
            this.requestId = Output.ofNullable(requestId);
            return this;
        }        public PublicDelegatedPrefixArgs build() {
            return new PublicDelegatedPrefixArgs(description, ipCidrRange, isLiveMigration, name, parentPrefix, project, publicDelegatedSubPrefixs, region, requestId);
        }
    }
}

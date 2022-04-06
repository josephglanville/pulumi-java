// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.organizations.inputs;

import io.pulumi.aws.organizations.inputs.OrganizationalUnitAccountGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OrganizationalUnitState extends io.pulumi.resources.ResourceArgs {

    public static final OrganizationalUnitState Empty = new OrganizationalUnitState();

    /**
     * List of child accounts for this Organizational Unit. Does not return account information for child Organizational Units. All elements have these attributes:
     * 
     */
    @Import(name="accounts")
      private final @Nullable Output<List<OrganizationalUnitAccountGetArgs>> accounts;

    public Output<List<OrganizationalUnitAccountGetArgs>> getAccounts() {
        return this.accounts == null ? Output.empty() : this.accounts;
    }

    /**
     * ARN of the organizational unit
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Output.empty() : this.arn;
    }

    /**
     * The name for the organizational unit
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * ID of the parent organizational unit, which may be the root
     * 
     */
    @Import(name="parentId")
      private final @Nullable Output<String> parentId;

    public Output<String> getParentId() {
        return this.parentId == null ? Output.empty() : this.parentId;
    }

    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Output.empty() : this.tagsAll;
    }

    public OrganizationalUnitState(
        @Nullable Output<List<OrganizationalUnitAccountGetArgs>> accounts,
        @Nullable Output<String> arn,
        @Nullable Output<String> name,
        @Nullable Output<String> parentId,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll) {
        this.accounts = accounts;
        this.arn = arn;
        this.name = name;
        this.parentId = parentId;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private OrganizationalUnitState() {
        this.accounts = Output.empty();
        this.arn = Output.empty();
        this.name = Output.empty();
        this.parentId = Output.empty();
        this.tags = Output.empty();
        this.tagsAll = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OrganizationalUnitState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<OrganizationalUnitAccountGetArgs>> accounts;
        private @Nullable Output<String> arn;
        private @Nullable Output<String> name;
        private @Nullable Output<String> parentId;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(OrganizationalUnitState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accounts = defaults.accounts;
    	      this.arn = defaults.arn;
    	      this.name = defaults.name;
    	      this.parentId = defaults.parentId;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
        }

        public Builder accounts(@Nullable Output<List<OrganizationalUnitAccountGetArgs>> accounts) {
            this.accounts = accounts;
            return this;
        }
        public Builder accounts(@Nullable List<OrganizationalUnitAccountGetArgs> accounts) {
            this.accounts = Output.ofNullable(accounts);
            return this;
        }
        public Builder accounts(OrganizationalUnitAccountGetArgs... accounts) {
            return accounts(List.of(accounts));
        }
        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Output.ofNullable(arn);
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
        public Builder parentId(@Nullable Output<String> parentId) {
            this.parentId = parentId;
            return this;
        }
        public Builder parentId(@Nullable String parentId) {
            this.parentId = Output.ofNullable(parentId);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }
        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Output.ofNullable(tagsAll);
            return this;
        }        public OrganizationalUnitState build() {
            return new OrganizationalUnitState(accounts, arn, name, parentId, tags, tagsAll);
        }
    }
}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.datacatalog.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PolicyTagState extends io.pulumi.resources.ResourceArgs {

    public static final PolicyTagState Empty = new PolicyTagState();

    /**
     * Resource names of child policy tags of this policy tag.
     * 
     */
    @InputImport(name="childPolicyTags")
      private final @Nullable Input<List<String>> childPolicyTags;

    public Input<List<String>> getChildPolicyTags() {
        return this.childPolicyTags == null ? Input.empty() : this.childPolicyTags;
    }

    /**
     * Description of this policy tag. It must: contain only unicode characters, tabs,
     * newlines, carriage returns and page breaks; and be at most 2000 bytes long when
     * encoded in UTF-8. If not set, defaults to an empty description.
     * If not set, defaults to an empty description.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * User defined name of this policy tag. It must: be unique within the parent
     * taxonomy; contain only unicode letters, numbers, underscores, dashes and spaces;
     * not start or end with spaces; and be at most 200 bytes long when encoded in UTF-8.
     * 
     */
    @InputImport(name="displayName")
      private final @Nullable Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

    /**
     * Resource name of this policy tag, whose format is:
     * "projects/{project}/locations/{region}/taxonomies/{taxonomy}/policyTags/{policytag}"
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Resource name of this policy tag's parent policy tag.
     * If empty, it means this policy tag is a top level policy tag.
     * If not set, defaults to an empty string.
     * 
     */
    @InputImport(name="parentPolicyTag")
      private final @Nullable Input<String> parentPolicyTag;

    public Input<String> getParentPolicyTag() {
        return this.parentPolicyTag == null ? Input.empty() : this.parentPolicyTag;
    }

    /**
     * Taxonomy the policy tag is associated with
     * 
     */
    @InputImport(name="taxonomy")
      private final @Nullable Input<String> taxonomy;

    public Input<String> getTaxonomy() {
        return this.taxonomy == null ? Input.empty() : this.taxonomy;
    }

    public PolicyTagState(
        @Nullable Input<List<String>> childPolicyTags,
        @Nullable Input<String> description,
        @Nullable Input<String> displayName,
        @Nullable Input<String> name,
        @Nullable Input<String> parentPolicyTag,
        @Nullable Input<String> taxonomy) {
        this.childPolicyTags = childPolicyTags;
        this.description = description;
        this.displayName = displayName;
        this.name = name;
        this.parentPolicyTag = parentPolicyTag;
        this.taxonomy = taxonomy;
    }

    private PolicyTagState() {
        this.childPolicyTags = Input.empty();
        this.description = Input.empty();
        this.displayName = Input.empty();
        this.name = Input.empty();
        this.parentPolicyTag = Input.empty();
        this.taxonomy = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyTagState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> childPolicyTags;
        private @Nullable Input<String> description;
        private @Nullable Input<String> displayName;
        private @Nullable Input<String> name;
        private @Nullable Input<String> parentPolicyTag;
        private @Nullable Input<String> taxonomy;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicyTagState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.childPolicyTags = defaults.childPolicyTags;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.name = defaults.name;
    	      this.parentPolicyTag = defaults.parentPolicyTag;
    	      this.taxonomy = defaults.taxonomy;
        }

        public Builder setChildPolicyTags(@Nullable Input<List<String>> childPolicyTags) {
            this.childPolicyTags = childPolicyTags;
            return this;
        }

        public Builder setChildPolicyTags(@Nullable List<String> childPolicyTags) {
            this.childPolicyTags = Input.ofNullable(childPolicyTags);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setDisplayName(@Nullable Input<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = Input.ofNullable(displayName);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setParentPolicyTag(@Nullable Input<String> parentPolicyTag) {
            this.parentPolicyTag = parentPolicyTag;
            return this;
        }

        public Builder setParentPolicyTag(@Nullable String parentPolicyTag) {
            this.parentPolicyTag = Input.ofNullable(parentPolicyTag);
            return this;
        }

        public Builder setTaxonomy(@Nullable Input<String> taxonomy) {
            this.taxonomy = taxonomy;
            return this;
        }

        public Builder setTaxonomy(@Nullable String taxonomy) {
            this.taxonomy = Input.ofNullable(taxonomy);
            return this;
        }
        public PolicyTagState build() {
            return new PolicyTagState(childPolicyTags, description, displayName, name, parentPolicyTag, taxonomy);
        }
    }
}

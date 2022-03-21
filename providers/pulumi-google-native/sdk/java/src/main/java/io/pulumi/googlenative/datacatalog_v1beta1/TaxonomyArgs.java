// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datacatalog_v1beta1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.datacatalog_v1beta1.enums.TaxonomyActivatedPolicyTypesItem;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TaxonomyArgs extends io.pulumi.resources.ResourceArgs {

    public static final TaxonomyArgs Empty = new TaxonomyArgs();

    /**
     * Optional. A list of policy types that are activated for this taxonomy. If not set, defaults to an empty list.
     * 
     */
    @Import(name="activatedPolicyTypes")
      private final @Nullable Output<List<TaxonomyActivatedPolicyTypesItem>> activatedPolicyTypes;

    public Output<List<TaxonomyActivatedPolicyTypesItem>> getActivatedPolicyTypes() {
        return this.activatedPolicyTypes == null ? Output.empty() : this.activatedPolicyTypes;
    }

    /**
     * Optional. Description of this taxonomy. It must: contain only unicode characters, tabs, newlines, carriage returns and page breaks; and be at most 2000 bytes long when encoded in UTF-8. If not set, defaults to an empty description.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * User defined name of this taxonomy. It must: contain only unicode letters, numbers, underscores, dashes and spaces; not start or end with spaces; and be at most 200 bytes long when encoded in UTF-8.
     * 
     */
    @Import(name="displayName", required=true)
      private final Output<String> displayName;

    public Output<String> getDisplayName() {
        return this.displayName;
    }

    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    public TaxonomyArgs(
        @Nullable Output<List<TaxonomyActivatedPolicyTypesItem>> activatedPolicyTypes,
        @Nullable Output<String> description,
        Output<String> displayName,
        @Nullable Output<String> location,
        @Nullable Output<String> project) {
        this.activatedPolicyTypes = activatedPolicyTypes;
        this.description = description;
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.location = location;
        this.project = project;
    }

    private TaxonomyArgs() {
        this.activatedPolicyTypes = Output.empty();
        this.description = Output.empty();
        this.displayName = Output.empty();
        this.location = Output.empty();
        this.project = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaxonomyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<TaxonomyActivatedPolicyTypesItem>> activatedPolicyTypes;
        private @Nullable Output<String> description;
        private Output<String> displayName;
        private @Nullable Output<String> location;
        private @Nullable Output<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(TaxonomyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activatedPolicyTypes = defaults.activatedPolicyTypes;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.location = defaults.location;
    	      this.project = defaults.project;
        }

        public Builder activatedPolicyTypes(@Nullable Output<List<TaxonomyActivatedPolicyTypesItem>> activatedPolicyTypes) {
            this.activatedPolicyTypes = activatedPolicyTypes;
            return this;
        }
        public Builder activatedPolicyTypes(@Nullable List<TaxonomyActivatedPolicyTypesItem> activatedPolicyTypes) {
            this.activatedPolicyTypes = Output.ofNullable(activatedPolicyTypes);
            return this;
        }
        public Builder activatedPolicyTypes(TaxonomyActivatedPolicyTypesItem... activatedPolicyTypes) {
            return activatedPolicyTypes(List.of(activatedPolicyTypes));
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }
        public Builder displayName(Output<String> displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Output.of(Objects.requireNonNull(displayName));
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
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }        public TaxonomyArgs build() {
            return new TaxonomyArgs(activatedPolicyTypes, description, displayName, location, project);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.datacatalog.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TaxonomyState extends io.pulumi.resources.ResourceArgs {

    public static final TaxonomyState Empty = new TaxonomyState();

    /**
     * A list of policy types that are activated for this taxonomy. If not set,
     * defaults to an empty list.
     * Each value may be one of `POLICY_TYPE_UNSPECIFIED` and `FINE_GRAINED_ACCESS_CONTROL`.
     * 
     */
    @Import(name="activatedPolicyTypes")
      private final @Nullable Output<List<String>> activatedPolicyTypes;

    public Output<List<String>> getActivatedPolicyTypes() {
        return this.activatedPolicyTypes == null ? Codegen.empty() : this.activatedPolicyTypes;
    }

    /**
     * Description of this taxonomy. It must: contain only unicode characters,
     * tabs, newlines, carriage returns and page breaks; and be at most 2000 bytes
     * long when encoded in UTF-8. If not set, defaults to an empty description.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * User defined name of this taxonomy.
     * It must: contain only unicode letters, numbers, underscores, dashes
     * and spaces; not start or end with spaces; and be at most 200 bytes
     * long when encoded in UTF-8.
     * 
     */
    @Import(name="displayName")
      private final @Nullable Output<String> displayName;

    public Output<String> getDisplayName() {
        return this.displayName == null ? Codegen.empty() : this.displayName;
    }

    /**
     * Resource name of this taxonomy, whose format is: "projects/{project}/locations/{region}/taxonomies/{taxonomy}".
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * Taxonomy location region.
     * 
     */
    @Import(name="region")
      private final @Nullable Output<String> region;

    public Output<String> getRegion() {
        return this.region == null ? Codegen.empty() : this.region;
    }

    public TaxonomyState(
        @Nullable Output<List<String>> activatedPolicyTypes,
        @Nullable Output<String> description,
        @Nullable Output<String> displayName,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        @Nullable Output<String> region) {
        this.activatedPolicyTypes = activatedPolicyTypes;
        this.description = description;
        this.displayName = displayName;
        this.name = name;
        this.project = project;
        this.region = region;
    }

    private TaxonomyState() {
        this.activatedPolicyTypes = Codegen.empty();
        this.description = Codegen.empty();
        this.displayName = Codegen.empty();
        this.name = Codegen.empty();
        this.project = Codegen.empty();
        this.region = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaxonomyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> activatedPolicyTypes;
        private @Nullable Output<String> description;
        private @Nullable Output<String> displayName;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private @Nullable Output<String> region;

        public Builder() {
    	      // Empty
        }

        public Builder(TaxonomyState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activatedPolicyTypes = defaults.activatedPolicyTypes;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
        }

        public Builder activatedPolicyTypes(@Nullable Output<List<String>> activatedPolicyTypes) {
            this.activatedPolicyTypes = activatedPolicyTypes;
            return this;
        }
        public Builder activatedPolicyTypes(@Nullable List<String> activatedPolicyTypes) {
            this.activatedPolicyTypes = Codegen.ofNullable(activatedPolicyTypes);
            return this;
        }
        public Builder activatedPolicyTypes(String... activatedPolicyTypes) {
            return activatedPolicyTypes(List.of(activatedPolicyTypes));
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder displayName(@Nullable Output<String> displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = Codegen.ofNullable(displayName);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder region(@Nullable Output<String> region) {
            this.region = region;
            return this;
        }
        public Builder region(@Nullable String region) {
            this.region = Codegen.ofNullable(region);
            return this;
        }        public TaxonomyState build() {
            return new TaxonomyState(activatedPolicyTypes, description, displayName, name, project, region);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.accesscontextmanager.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecArgs;
import io.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServicePerimetersServicePerimeterArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServicePerimetersServicePerimeterArgs Empty = new ServicePerimetersServicePerimeterArgs();

    /**
     * - 
     * Time the AccessPolicy was created in UTC.
     * 
     */
    @Import(name="createTime")
      private final @Nullable Output<String> createTime;

    public Output<String> getCreateTime() {
        return this.createTime == null ? Codegen.empty() : this.createTime;
    }

    /**
     * Description of the ServicePerimeter and its use. Does not affect
     * behavior.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * Resource name for the ServicePerimeter. The short_name component must
     * begin with a letter and only include alphanumeric and '_'.
     * Format: accessPolicies/{policy_id}/servicePerimeters/{short_name}
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    /**
     * Specifies the type of the Perimeter. There are two types: regular and
     * bridge. Regular Service Perimeter contains resources, access levels,
     * and restricted services. Every resource can be in at most
     * ONE regular Service Perimeter.
     * In addition to being in a regular service perimeter, a resource can also
     * be in zero or more perimeter bridges. A perimeter bridge only contains
     * resources. Cross project operations are permitted if all effected
     * resources share some perimeter (whether bridge or regular). Perimeter
     * Bridge does not contain access levels or services: those are governed
     * entirely by the regular perimeter that resource is in.
     * Perimeter Bridges are typically useful when building more complex
     * topologies with many independent perimeters that need to share some data
     * with a common perimeter, but should not be able to share data among
     * themselves.
     * Default value is `PERIMETER_TYPE_REGULAR`.
     * Possible values are `PERIMETER_TYPE_REGULAR` and `PERIMETER_TYPE_BRIDGE`.
     * 
     */
    @Import(name="perimeterType")
      private final @Nullable Output<String> perimeterType;

    public Output<String> getPerimeterType() {
        return this.perimeterType == null ? Codegen.empty() : this.perimeterType;
    }

    /**
     * Proposed (or dry run) ServicePerimeter configuration.
     * This configuration allows to specify and test ServicePerimeter configuration
     * without enforcing actual access restrictions. Only allowed to be set when
     * the `useExplicitDryRunSpec` flag is set.
     * Structure is documented below.
     * 
     */
    @Import(name="spec")
      private final @Nullable Output<ServicePerimetersServicePerimeterSpecArgs> spec;

    public Output<ServicePerimetersServicePerimeterSpecArgs> getSpec() {
        return this.spec == null ? Codegen.empty() : this.spec;
    }

    /**
     * ServicePerimeter configuration. Specifies sets of resources,
     * restricted services and access levels that determine
     * perimeter content and boundaries.
     * Structure is documented below.
     * 
     */
    @Import(name="status")
      private final @Nullable Output<ServicePerimetersServicePerimeterStatusArgs> status;

    public Output<ServicePerimetersServicePerimeterStatusArgs> getStatus() {
        return this.status == null ? Codegen.empty() : this.status;
    }

    /**
     * Human readable title. Must be unique within the Policy.
     * 
     */
    @Import(name="title", required=true)
      private final Output<String> title;

    public Output<String> getTitle() {
        return this.title;
    }

    /**
     * - 
     * Time the AccessPolicy was updated in UTC.
     * 
     */
    @Import(name="updateTime")
      private final @Nullable Output<String> updateTime;

    public Output<String> getUpdateTime() {
        return this.updateTime == null ? Codegen.empty() : this.updateTime;
    }

    /**
     * Use explicit dry run spec flag. Ordinarily, a dry-run spec implicitly exists
     * for all Service Perimeters, and that spec is identical to the status for those
     * Service Perimeters. When this flag is set, it inhibits the generation of the
     * implicit spec, thereby allowing the user to explicitly provide a
     * configuration ("spec") to use in a dry-run version of the Service Perimeter.
     * This allows the user to test changes to the enforced config ("status") without
     * actually enforcing them. This testing is done through analyzing the differences
     * between currently enforced and suggested restrictions. useExplicitDryRunSpec must
     * bet set to True if any of the fields in the spec are set to non-default values.
     * 
     */
    @Import(name="useExplicitDryRunSpec")
      private final @Nullable Output<Boolean> useExplicitDryRunSpec;

    public Output<Boolean> getUseExplicitDryRunSpec() {
        return this.useExplicitDryRunSpec == null ? Codegen.empty() : this.useExplicitDryRunSpec;
    }

    public ServicePerimetersServicePerimeterArgs(
        @Nullable Output<String> createTime,
        @Nullable Output<String> description,
        Output<String> name,
        @Nullable Output<String> perimeterType,
        @Nullable Output<ServicePerimetersServicePerimeterSpecArgs> spec,
        @Nullable Output<ServicePerimetersServicePerimeterStatusArgs> status,
        Output<String> title,
        @Nullable Output<String> updateTime,
        @Nullable Output<Boolean> useExplicitDryRunSpec) {
        this.createTime = createTime;
        this.description = description;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.perimeterType = perimeterType;
        this.spec = spec;
        this.status = status;
        this.title = Objects.requireNonNull(title, "expected parameter 'title' to be non-null");
        this.updateTime = updateTime;
        this.useExplicitDryRunSpec = useExplicitDryRunSpec;
    }

    private ServicePerimetersServicePerimeterArgs() {
        this.createTime = Codegen.empty();
        this.description = Codegen.empty();
        this.name = Codegen.empty();
        this.perimeterType = Codegen.empty();
        this.spec = Codegen.empty();
        this.status = Codegen.empty();
        this.title = Codegen.empty();
        this.updateTime = Codegen.empty();
        this.useExplicitDryRunSpec = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServicePerimetersServicePerimeterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> createTime;
        private @Nullable Output<String> description;
        private Output<String> name;
        private @Nullable Output<String> perimeterType;
        private @Nullable Output<ServicePerimetersServicePerimeterSpecArgs> spec;
        private @Nullable Output<ServicePerimetersServicePerimeterStatusArgs> status;
        private Output<String> title;
        private @Nullable Output<String> updateTime;
        private @Nullable Output<Boolean> useExplicitDryRunSpec;

        public Builder() {
    	      // Empty
        }

        public Builder(ServicePerimetersServicePerimeterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.perimeterType = defaults.perimeterType;
    	      this.spec = defaults.spec;
    	      this.status = defaults.status;
    	      this.title = defaults.title;
    	      this.updateTime = defaults.updateTime;
    	      this.useExplicitDryRunSpec = defaults.useExplicitDryRunSpec;
        }

        public Builder createTime(@Nullable Output<String> createTime) {
            this.createTime = createTime;
            return this;
        }
        public Builder createTime(@Nullable String createTime) {
            this.createTime = Codegen.ofNullable(createTime);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }
        public Builder perimeterType(@Nullable Output<String> perimeterType) {
            this.perimeterType = perimeterType;
            return this;
        }
        public Builder perimeterType(@Nullable String perimeterType) {
            this.perimeterType = Codegen.ofNullable(perimeterType);
            return this;
        }
        public Builder spec(@Nullable Output<ServicePerimetersServicePerimeterSpecArgs> spec) {
            this.spec = spec;
            return this;
        }
        public Builder spec(@Nullable ServicePerimetersServicePerimeterSpecArgs spec) {
            this.spec = Codegen.ofNullable(spec);
            return this;
        }
        public Builder status(@Nullable Output<ServicePerimetersServicePerimeterStatusArgs> status) {
            this.status = status;
            return this;
        }
        public Builder status(@Nullable ServicePerimetersServicePerimeterStatusArgs status) {
            this.status = Codegen.ofNullable(status);
            return this;
        }
        public Builder title(Output<String> title) {
            this.title = Objects.requireNonNull(title);
            return this;
        }
        public Builder title(String title) {
            this.title = Output.of(Objects.requireNonNull(title));
            return this;
        }
        public Builder updateTime(@Nullable Output<String> updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Builder updateTime(@Nullable String updateTime) {
            this.updateTime = Codegen.ofNullable(updateTime);
            return this;
        }
        public Builder useExplicitDryRunSpec(@Nullable Output<Boolean> useExplicitDryRunSpec) {
            this.useExplicitDryRunSpec = useExplicitDryRunSpec;
            return this;
        }
        public Builder useExplicitDryRunSpec(@Nullable Boolean useExplicitDryRunSpec) {
            this.useExplicitDryRunSpec = Codegen.ofNullable(useExplicitDryRunSpec);
            return this;
        }        public ServicePerimetersServicePerimeterArgs build() {
            return new ServicePerimetersServicePerimeterArgs(createTime, description, name, perimeterType, spec, status, title, updateTime, useExplicitDryRunSpec);
        }
    }
}

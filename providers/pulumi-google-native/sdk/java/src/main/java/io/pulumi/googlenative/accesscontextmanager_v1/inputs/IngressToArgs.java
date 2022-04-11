// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.accesscontextmanager_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.accesscontextmanager_v1.inputs.ApiOperationArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Defines the conditions under which an IngressPolicy matches a request. Conditions are based on information about the ApiOperation intended to be performed on the target resource of the request. The request must satisfy what is defined in `operations` AND `resources` in order to match.
 * 
 */
public final class IngressToArgs extends io.pulumi.resources.ResourceArgs {

    public static final IngressToArgs Empty = new IngressToArgs();

    /**
     * A list of ApiOperations allowed to be performed by the sources specified in corresponding IngressFrom in this ServicePerimeter.
     * 
     */
    @Import(name="operations")
      private final @Nullable Output<List<ApiOperationArgs>> operations;

    public Output<List<ApiOperationArgs>> getOperations() {
        return this.operations == null ? Codegen.empty() : this.operations;
    }

    /**
     * A list of resources, currently only projects in the form `projects/`, protected by this ServicePerimeter that are allowed to be accessed by sources defined in the corresponding IngressFrom. If a single `*` is specified, then access to all resources inside the perimeter are allowed.
     * 
     */
    @Import(name="resources")
      private final @Nullable Output<List<String>> resources;

    public Output<List<String>> getResources() {
        return this.resources == null ? Codegen.empty() : this.resources;
    }

    public IngressToArgs(
        @Nullable Output<List<ApiOperationArgs>> operations,
        @Nullable Output<List<String>> resources) {
        this.operations = operations;
        this.resources = resources;
    }

    private IngressToArgs() {
        this.operations = Codegen.empty();
        this.resources = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IngressToArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<ApiOperationArgs>> operations;
        private @Nullable Output<List<String>> resources;

        public Builder() {
    	      // Empty
        }

        public Builder(IngressToArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.operations = defaults.operations;
    	      this.resources = defaults.resources;
        }

        public Builder operations(@Nullable Output<List<ApiOperationArgs>> operations) {
            this.operations = operations;
            return this;
        }
        public Builder operations(@Nullable List<ApiOperationArgs> operations) {
            this.operations = Codegen.ofNullable(operations);
            return this;
        }
        public Builder operations(ApiOperationArgs... operations) {
            return operations(List.of(operations));
        }
        public Builder resources(@Nullable Output<List<String>> resources) {
            this.resources = resources;
            return this;
        }
        public Builder resources(@Nullable List<String> resources) {
            this.resources = Codegen.ofNullable(resources);
            return this;
        }
        public Builder resources(String... resources) {
            return resources(List.of(resources));
        }        public IngressToArgs build() {
            return new IngressToArgs(operations, resources);
        }
    }
}

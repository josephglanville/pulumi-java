// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecs.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServicePlacementConstraintArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServicePlacementConstraintArgs Empty = new ServicePlacementConstraintArgs();

    /**
     * Cluster Query Language expression to apply to the constraint. Does not need to be specified for the `distinctInstance` type. For more information, see [Cluster Query Language in the Amazon EC2 Container Service Developer Guide](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/cluster-query-language.html).
     * 
     */
    @InputImport(name="expression")
      private final @Nullable Output<String> expression;

    public Output<String> getExpression() {
        return this.expression == null ? Output.empty() : this.expression;
    }

    /**
     * Type of constraint. The only valid values at this time are `memberOf` and `distinctInstance`.
     * 
     */
    @InputImport(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public ServicePlacementConstraintArgs(
        @Nullable Output<String> expression,
        Output<String> type) {
        this.expression = expression;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ServicePlacementConstraintArgs() {
        this.expression = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServicePlacementConstraintArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> expression;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ServicePlacementConstraintArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expression = defaults.expression;
    	      this.type = defaults.type;
        }

        public Builder expression(@Nullable Output<String> expression) {
            this.expression = expression;
            return this;
        }

        public Builder expression(@Nullable String expression) {
            this.expression = Output.ofNullable(expression);
            return this;
        }

        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }
        public ServicePlacementConstraintArgs build() {
            return new ServicePlacementConstraintArgs(expression, type);
        }
    }
}

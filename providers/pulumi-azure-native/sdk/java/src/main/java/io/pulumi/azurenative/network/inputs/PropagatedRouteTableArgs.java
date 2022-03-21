// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.inputs.SubResourceArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The list of RouteTables to advertise the routes to.
 * 
 */
public final class PropagatedRouteTableArgs extends io.pulumi.resources.ResourceArgs {

    public static final PropagatedRouteTableArgs Empty = new PropagatedRouteTableArgs();

    /**
     * The list of resource ids of all the RouteTables.
     * 
     */
    @Import(name="ids")
      private final @Nullable Output<List<SubResourceArgs>> ids;

    public Output<List<SubResourceArgs>> getIds() {
        return this.ids == null ? Output.empty() : this.ids;
    }

    /**
     * The list of labels.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<List<String>> labels;

    public Output<List<String>> getLabels() {
        return this.labels == null ? Output.empty() : this.labels;
    }

    public PropagatedRouteTableArgs(
        @Nullable Output<List<SubResourceArgs>> ids,
        @Nullable Output<List<String>> labels) {
        this.ids = ids;
        this.labels = labels;
    }

    private PropagatedRouteTableArgs() {
        this.ids = Output.empty();
        this.labels = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PropagatedRouteTableArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<SubResourceArgs>> ids;
        private @Nullable Output<List<String>> labels;

        public Builder() {
    	      // Empty
        }

        public Builder(PropagatedRouteTableArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ids = defaults.ids;
    	      this.labels = defaults.labels;
        }

        public Builder ids(@Nullable Output<List<SubResourceArgs>> ids) {
            this.ids = ids;
            return this;
        }
        public Builder ids(@Nullable List<SubResourceArgs> ids) {
            this.ids = Output.ofNullable(ids);
            return this;
        }
        public Builder ids(SubResourceArgs... ids) {
            return ids(List.of(ids));
        }
        public Builder labels(@Nullable Output<List<String>> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(@Nullable List<String> labels) {
            this.labels = Output.ofNullable(labels);
            return this;
        }
        public Builder labels(String... labels) {
            return labels(List.of(labels));
        }        public PropagatedRouteTableArgs build() {
            return new PropagatedRouteTableArgs(ids, labels);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.portal.inputs;

import io.pulumi.azurenative.portal.inputs.DashboardPartsArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A dashboard lens.
 * 
 */
public final class DashboardLensArgs extends io.pulumi.resources.ResourceArgs {

    public static final DashboardLensArgs Empty = new DashboardLensArgs();

    /**
     * The dashboard len's metadata.
     * 
     */
    @Import(name="metadata")
      private final @Nullable Output<Map<String,Object>> metadata;

    public Output<Map<String,Object>> getMetadata() {
        return this.metadata == null ? Output.empty() : this.metadata;
    }

    /**
     * The lens order.
     * 
     */
    @Import(name="order", required=true)
      private final Output<Integer> order;

    public Output<Integer> getOrder() {
        return this.order;
    }

    /**
     * The dashboard parts.
     * 
     */
    @Import(name="parts", required=true)
      private final Output<List<DashboardPartsArgs>> parts;

    public Output<List<DashboardPartsArgs>> getParts() {
        return this.parts;
    }

    public DashboardLensArgs(
        @Nullable Output<Map<String,Object>> metadata,
        Output<Integer> order,
        Output<List<DashboardPartsArgs>> parts) {
        this.metadata = metadata;
        this.order = Objects.requireNonNull(order, "expected parameter 'order' to be non-null");
        this.parts = Objects.requireNonNull(parts, "expected parameter 'parts' to be non-null");
    }

    private DashboardLensArgs() {
        this.metadata = Output.empty();
        this.order = Output.empty();
        this.parts = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DashboardLensArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Map<String,Object>> metadata;
        private Output<Integer> order;
        private Output<List<DashboardPartsArgs>> parts;

        public Builder() {
    	      // Empty
        }

        public Builder(DashboardLensArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metadata = defaults.metadata;
    	      this.order = defaults.order;
    	      this.parts = defaults.parts;
        }

        public Builder metadata(@Nullable Output<Map<String,Object>> metadata) {
            this.metadata = metadata;
            return this;
        }
        public Builder metadata(@Nullable Map<String,Object> metadata) {
            this.metadata = Output.ofNullable(metadata);
            return this;
        }
        public Builder order(Output<Integer> order) {
            this.order = Objects.requireNonNull(order);
            return this;
        }
        public Builder order(Integer order) {
            this.order = Output.of(Objects.requireNonNull(order));
            return this;
        }
        public Builder parts(Output<List<DashboardPartsArgs>> parts) {
            this.parts = Objects.requireNonNull(parts);
            return this;
        }
        public Builder parts(List<DashboardPartsArgs> parts) {
            this.parts = Output.of(Objects.requireNonNull(parts));
            return this;
        }
        public Builder parts(DashboardPartsArgs... parts) {
            return parts(List.of(parts));
        }        public DashboardLensArgs build() {
            return new DashboardLensArgs(metadata, order, parts);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dns_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.dns_v1.inputs.RRSetRoutingPolicyGeoPolicyGeoPolicyItemArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Configures a RRSetRoutingPolicy that routes based on the geo location of the querying user.
 * 
 */
public final class RRSetRoutingPolicyGeoPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final RRSetRoutingPolicyGeoPolicyArgs Empty = new RRSetRoutingPolicyGeoPolicyArgs();

    /**
     * The primary geo routing configuration. If there are multiple items with the same location, an error is returned instead.
     * 
     */
    @Import(name="items")
      private final @Nullable Output<List<RRSetRoutingPolicyGeoPolicyGeoPolicyItemArgs>> items;

    public Output<List<RRSetRoutingPolicyGeoPolicyGeoPolicyItemArgs>> getItems() {
        return this.items == null ? Output.empty() : this.items;
    }

    @Import(name="kind")
      private final @Nullable Output<String> kind;

    public Output<String> getKind() {
        return this.kind == null ? Output.empty() : this.kind;
    }

    public RRSetRoutingPolicyGeoPolicyArgs(
        @Nullable Output<List<RRSetRoutingPolicyGeoPolicyGeoPolicyItemArgs>> items,
        @Nullable Output<String> kind) {
        this.items = items;
        this.kind = kind;
    }

    private RRSetRoutingPolicyGeoPolicyArgs() {
        this.items = Output.empty();
        this.kind = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RRSetRoutingPolicyGeoPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<RRSetRoutingPolicyGeoPolicyGeoPolicyItemArgs>> items;
        private @Nullable Output<String> kind;

        public Builder() {
    	      // Empty
        }

        public Builder(RRSetRoutingPolicyGeoPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.items = defaults.items;
    	      this.kind = defaults.kind;
        }

        public Builder items(@Nullable Output<List<RRSetRoutingPolicyGeoPolicyGeoPolicyItemArgs>> items) {
            this.items = items;
            return this;
        }
        public Builder items(@Nullable List<RRSetRoutingPolicyGeoPolicyGeoPolicyItemArgs> items) {
            this.items = Output.ofNullable(items);
            return this;
        }
        public Builder items(RRSetRoutingPolicyGeoPolicyGeoPolicyItemArgs... items) {
            return items(List.of(items));
        }
        public Builder kind(@Nullable Output<String> kind) {
            this.kind = kind;
            return this;
        }
        public Builder kind(@Nullable String kind) {
            this.kind = Output.ofNullable(kind);
            return this;
        }        public RRSetRoutingPolicyGeoPolicyArgs build() {
            return new RRSetRoutingPolicyGeoPolicyArgs(items, kind);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.portal.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The dashboard's part position.
 * 
 */
public final class DashboardPartsPositionArgs extends io.pulumi.resources.ResourceArgs {

    public static final DashboardPartsPositionArgs Empty = new DashboardPartsPositionArgs();

    /**
     * The dashboard's part column span.
     * 
     */
    @Import(name="colSpan", required=true)
      private final Output<Integer> colSpan;

    public Output<Integer> getColSpan() {
        return this.colSpan;
    }

    /**
     * The dashboard part's metadata.
     * 
     */
    @Import(name="metadata")
      private final @Nullable Output<Map<String,Object>> metadata;

    public Output<Map<String,Object>> getMetadata() {
        return this.metadata == null ? Codegen.empty() : this.metadata;
    }

    /**
     * The dashboard's part row span.
     * 
     */
    @Import(name="rowSpan", required=true)
      private final Output<Integer> rowSpan;

    public Output<Integer> getRowSpan() {
        return this.rowSpan;
    }

    /**
     * The dashboard's part x coordinate.
     * 
     */
    @Import(name="x", required=true)
      private final Output<Integer> x;

    public Output<Integer> getX() {
        return this.x;
    }

    /**
     * The dashboard's part y coordinate.
     * 
     */
    @Import(name="y", required=true)
      private final Output<Integer> y;

    public Output<Integer> getY() {
        return this.y;
    }

    public DashboardPartsPositionArgs(
        Output<Integer> colSpan,
        @Nullable Output<Map<String,Object>> metadata,
        Output<Integer> rowSpan,
        Output<Integer> x,
        Output<Integer> y) {
        this.colSpan = Objects.requireNonNull(colSpan, "expected parameter 'colSpan' to be non-null");
        this.metadata = metadata;
        this.rowSpan = Objects.requireNonNull(rowSpan, "expected parameter 'rowSpan' to be non-null");
        this.x = Objects.requireNonNull(x, "expected parameter 'x' to be non-null");
        this.y = Objects.requireNonNull(y, "expected parameter 'y' to be non-null");
    }

    private DashboardPartsPositionArgs() {
        this.colSpan = Codegen.empty();
        this.metadata = Codegen.empty();
        this.rowSpan = Codegen.empty();
        this.x = Codegen.empty();
        this.y = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DashboardPartsPositionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Integer> colSpan;
        private @Nullable Output<Map<String,Object>> metadata;
        private Output<Integer> rowSpan;
        private Output<Integer> x;
        private Output<Integer> y;

        public Builder() {
    	      // Empty
        }

        public Builder(DashboardPartsPositionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.colSpan = defaults.colSpan;
    	      this.metadata = defaults.metadata;
    	      this.rowSpan = defaults.rowSpan;
    	      this.x = defaults.x;
    	      this.y = defaults.y;
        }

        public Builder colSpan(Output<Integer> colSpan) {
            this.colSpan = Objects.requireNonNull(colSpan);
            return this;
        }
        public Builder colSpan(Integer colSpan) {
            this.colSpan = Output.of(Objects.requireNonNull(colSpan));
            return this;
        }
        public Builder metadata(@Nullable Output<Map<String,Object>> metadata) {
            this.metadata = metadata;
            return this;
        }
        public Builder metadata(@Nullable Map<String,Object> metadata) {
            this.metadata = Codegen.ofNullable(metadata);
            return this;
        }
        public Builder rowSpan(Output<Integer> rowSpan) {
            this.rowSpan = Objects.requireNonNull(rowSpan);
            return this;
        }
        public Builder rowSpan(Integer rowSpan) {
            this.rowSpan = Output.of(Objects.requireNonNull(rowSpan));
            return this;
        }
        public Builder x(Output<Integer> x) {
            this.x = Objects.requireNonNull(x);
            return this;
        }
        public Builder x(Integer x) {
            this.x = Output.of(Objects.requireNonNull(x));
            return this;
        }
        public Builder y(Output<Integer> y) {
            this.y = Objects.requireNonNull(y);
            return this;
        }
        public Builder y(Integer y) {
            this.y = Output.of(Objects.requireNonNull(y));
            return this;
        }        public DashboardPartsPositionArgs build() {
            return new DashboardPartsPositionArgs(colSpan, metadata, rowSpan, x, y);
        }
    }
}

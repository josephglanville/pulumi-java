// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.costmanagement.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The order by expression to be used in the report.
 * 
 */
public final class ReportConfigSortingResponse extends io.pulumi.resources.InvokeArgs {

    public static final ReportConfigSortingResponse Empty = new ReportConfigSortingResponse();

    /**
     * Direction of sort.
     * 
     */
    @InputImport(name="direction")
      private final @Nullable String direction;

    public Optional<String> getDirection() {
        return this.direction == null ? Optional.empty() : Optional.ofNullable(this.direction);
    }

    /**
     * The name of the column to sort.
     * 
     */
    @InputImport(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    public ReportConfigSortingResponse(
        @Nullable String direction,
        String name) {
        this.direction = direction;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private ReportConfigSortingResponse() {
        this.direction = null;
        this.name = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReportConfigSortingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String direction;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(ReportConfigSortingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.direction = defaults.direction;
    	      this.name = defaults.name;
        }

        public Builder setDirection(@Nullable String direction) {
            this.direction = direction;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public ReportConfigSortingResponse build() {
            return new ReportConfigSortingResponse(direction, name);
        }
    }
}

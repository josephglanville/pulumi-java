// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.costmanagement.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ReportConfigSortingResponse {
    private final @Nullable String direction;
    private final String name;

    @OutputCustomType.Constructor({"direction","name"})
    private ReportConfigSortingResponse(
        @Nullable String direction,
        String name) {
        this.direction = direction;
        this.name = Objects.requireNonNull(name);
    }

    public Optional<String> getDirection() {
        return Optional.ofNullable(this.direction);
    }
    public String getName() {
        return this.name;
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

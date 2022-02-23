// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.amplifyuibuilder.inputs;

import io.pulumi.awsnative.amplifyuibuilder.inputs.ThemeValues;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ThemeValue extends io.pulumi.resources.InvokeArgs {

    public static final ThemeValue Empty = new ThemeValue();

    @InputImport(name="children")
      private final @Nullable List<ThemeValues> children;

    public List<ThemeValues> getChildren() {
        return this.children == null ? List.of() : this.children;
    }

    @InputImport(name="value")
      private final @Nullable String value;

    public Optional<String> getValue() {
        return this.value == null ? Optional.empty() : Optional.ofNullable(this.value);
    }

    public ThemeValue(
        @Nullable List<ThemeValues> children,
        @Nullable String value) {
        this.children = children;
        this.value = value;
    }

    private ThemeValue() {
        this.children = List.of();
        this.value = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ThemeValue defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ThemeValues> children;
        private @Nullable String value;

        public Builder() {
    	      // Empty
        }

        public Builder(ThemeValue defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.children = defaults.children;
    	      this.value = defaults.value;
        }

        public Builder setChildren(@Nullable List<ThemeValues> children) {
            this.children = children;
            return this;
        }

        public Builder setValue(@Nullable String value) {
            this.value = value;
            return this;
        }
        public ThemeValue build() {
            return new ThemeValue(children, value);
        }
    }
}

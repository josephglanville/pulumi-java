// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Core.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetCrossConnectsFilter {
    private final String name;
    private final @Nullable Boolean regex;
    private final List<String> values;

    @CustomType.Constructor
    private GetCrossConnectsFilter(
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("regex") @Nullable Boolean regex,
        @CustomType.Parameter("values") List<String> values) {
        this.name = name;
        this.regex = regex;
        this.values = values;
    }

    public String name() {
        return this.name;
    }
    public Optional<Boolean> regex() {
        return Optional.ofNullable(this.regex);
    }
    public List<String> values() {
        return this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCrossConnectsFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private @Nullable Boolean regex;
        private List<String> values;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCrossConnectsFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.regex = defaults.regex;
    	      this.values = defaults.values;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder regex(@Nullable Boolean regex) {
            this.regex = regex;
            return this;
        }
        public Builder values(List<String> values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }
        public Builder values(String... values) {
            return values(List.of(values));
        }        public GetCrossConnectsFilter build() {
            return new GetCrossConnectsFilter(name, regex, values);
        }
    }
}

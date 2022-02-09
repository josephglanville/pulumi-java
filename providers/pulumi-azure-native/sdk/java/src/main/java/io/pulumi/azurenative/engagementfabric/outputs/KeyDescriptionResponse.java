// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.engagementfabric.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class KeyDescriptionResponse {
    private final String name;
    private final String rank;
    private final String value;

    @OutputCustomType.Constructor({"name","rank","value"})
    private KeyDescriptionResponse(
        String name,
        String rank,
        String value) {
        this.name = Objects.requireNonNull(name);
        this.rank = Objects.requireNonNull(rank);
        this.value = Objects.requireNonNull(value);
    }

    public String getName() {
        return this.name;
    }
    public String getRank() {
        return this.rank;
    }
    public String getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyDescriptionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String rank;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyDescriptionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.rank = defaults.rank;
    	      this.value = defaults.value;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setRank(String rank) {
            this.rank = Objects.requireNonNull(rank);
            return this;
        }

        public Builder setValue(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public KeyDescriptionResponse build() {
            return new KeyDescriptionResponse(name, rank, value);
        }
    }
}

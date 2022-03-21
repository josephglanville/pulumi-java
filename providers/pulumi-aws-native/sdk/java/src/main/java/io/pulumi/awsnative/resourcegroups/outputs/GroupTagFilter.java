// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.resourcegroups.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GroupTagFilter {
    private final @Nullable String key;
    private final @Nullable List<String> values;

    @CustomType.Constructor
    private GroupTagFilter(
        @CustomType.Parameter("key") @Nullable String key,
        @CustomType.Parameter("values") @Nullable List<String> values) {
        this.key = key;
        this.values = values;
    }

    public Optional<String> getKey() {
        return Optional.ofNullable(this.key);
    }
    public List<String> getValues() {
        return this.values == null ? List.of() : this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GroupTagFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String key;
        private @Nullable List<String> values;

        public Builder() {
    	      // Empty
        }

        public Builder(GroupTagFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.values = defaults.values;
        }

        public Builder key(@Nullable String key) {
            this.key = key;
            return this;
        }
        public Builder values(@Nullable List<String> values) {
            this.values = values;
            return this;
        }
        public Builder values(String... values) {
            return values(List.of(values));
        }        public GroupTagFilter build() {
            return new GroupTagFilter(key, values);
        }
    }
}

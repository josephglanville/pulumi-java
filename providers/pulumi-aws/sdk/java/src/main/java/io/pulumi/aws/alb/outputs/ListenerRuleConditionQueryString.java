// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.alb.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ListenerRuleConditionQueryString {
    /**
     * Query string key pattern to match.
     * 
     */
    private final @Nullable String key;
    /**
     * Query string value pattern to match.
     * 
     */
    private final String value;

    @OutputCustomType.Constructor
    private ListenerRuleConditionQueryString(
        @OutputCustomType.Parameter("key") @Nullable String key,
        @OutputCustomType.Parameter("value") String value) {
        this.key = key;
        this.value = value;
    }

    /**
     * Query string key pattern to match.
     * 
    */
    public Optional<String> getKey() {
        return Optional.ofNullable(this.key);
    }
    /**
     * Query string value pattern to match.
     * 
    */
    public String getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerRuleConditionQueryString defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String key;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(ListenerRuleConditionQueryString defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.value = defaults.value;
        }

        public Builder setKey(@Nullable String key) {
            this.key = key;
            return this;
        }

        public Builder setValue(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public ListenerRuleConditionQueryString build() {
            return new ListenerRuleConditionQueryString(key, value);
        }
    }
}

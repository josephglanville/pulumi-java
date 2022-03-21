// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudwatch.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EventConnectionAuthParametersOauthOauthHttpParametersBodyArgs extends io.pulumi.resources.ResourceArgs {

    public static final EventConnectionAuthParametersOauthOauthHttpParametersBodyArgs Empty = new EventConnectionAuthParametersOauthOauthHttpParametersBodyArgs();

    /**
     * Specified whether the value is secret.
     * 
     */
    @Import(name="isValueSecret")
      private final @Nullable Output<Boolean> isValueSecret;

    public Output<Boolean> getIsValueSecret() {
        return this.isValueSecret == null ? Output.empty() : this.isValueSecret;
    }

    /**
     * Header Name.
     * 
     */
    @Import(name="key")
      private final @Nullable Output<String> key;

    public Output<String> getKey() {
        return this.key == null ? Output.empty() : this.key;
    }

    /**
     * Header Value. Created and stored in AWS Secrets Manager.
     * 
     */
    @Import(name="value")
      private final @Nullable Output<String> value;

    public Output<String> getValue() {
        return this.value == null ? Output.empty() : this.value;
    }

    public EventConnectionAuthParametersOauthOauthHttpParametersBodyArgs(
        @Nullable Output<Boolean> isValueSecret,
        @Nullable Output<String> key,
        @Nullable Output<String> value) {
        this.isValueSecret = isValueSecret;
        this.key = key;
        this.value = value;
    }

    private EventConnectionAuthParametersOauthOauthHttpParametersBodyArgs() {
        this.isValueSecret = Output.empty();
        this.key = Output.empty();
        this.value = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventConnectionAuthParametersOauthOauthHttpParametersBodyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> isValueSecret;
        private @Nullable Output<String> key;
        private @Nullable Output<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(EventConnectionAuthParametersOauthOauthHttpParametersBodyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isValueSecret = defaults.isValueSecret;
    	      this.key = defaults.key;
    	      this.value = defaults.value;
        }

        public Builder isValueSecret(@Nullable Output<Boolean> isValueSecret) {
            this.isValueSecret = isValueSecret;
            return this;
        }
        public Builder isValueSecret(@Nullable Boolean isValueSecret) {
            this.isValueSecret = Output.ofNullable(isValueSecret);
            return this;
        }
        public Builder key(@Nullable Output<String> key) {
            this.key = key;
            return this;
        }
        public Builder key(@Nullable String key) {
            this.key = Output.ofNullable(key);
            return this;
        }
        public Builder value(@Nullable Output<String> value) {
            this.value = value;
            return this;
        }
        public Builder value(@Nullable String value) {
            this.value = Output.ofNullable(value);
            return this;
        }        public EventConnectionAuthParametersOauthOauthHttpParametersBodyArgs build() {
            return new EventConnectionAuthParametersOauthOauthHttpParametersBodyArgs(isValueSecret, key, value);
        }
    }
}

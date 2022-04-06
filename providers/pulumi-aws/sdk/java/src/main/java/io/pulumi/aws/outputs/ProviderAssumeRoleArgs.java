// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.outputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class ProviderAssumeRoleArgs {
    private final @Nullable Output<Integer> durationSeconds;
    private final @Nullable Output<String> externalId;
    private final @Nullable Output<String> policy;
    private final @Nullable Output<List<String>> policyArns;
    private final @Nullable Output<String> roleArn;
    private final @Nullable Output<String> sessionName;
    private final @Nullable Output<Map<String,String>> tags;
    private final @Nullable Output<List<String>> transitiveTagKeys;

    @CustomType.Constructor
    private ProviderAssumeRoleArgs(
        @CustomType.Parameter("durationSeconds") @Nullable Output<Integer> durationSeconds,
        @CustomType.Parameter("externalId") @Nullable Output<String> externalId,
        @CustomType.Parameter("policy") @Nullable Output<String> policy,
        @CustomType.Parameter("policyArns") @Nullable Output<List<String>> policyArns,
        @CustomType.Parameter("roleArn") @Nullable Output<String> roleArn,
        @CustomType.Parameter("sessionName") @Nullable Output<String> sessionName,
        @CustomType.Parameter("tags") @Nullable Output<Map<String,String>> tags,
        @CustomType.Parameter("transitiveTagKeys") @Nullable Output<List<String>> transitiveTagKeys) {
        this.durationSeconds = durationSeconds;
        this.externalId = externalId;
        this.policy = policy;
        this.policyArns = policyArns;
        this.roleArn = roleArn;
        this.sessionName = sessionName;
        this.tags = tags;
        this.transitiveTagKeys = transitiveTagKeys;
    }

    public @Nullable Output<Integer> getDurationSeconds() {
        return this.durationSeconds;
    }
    public @Nullable Output<String> getExternalId() {
        return this.externalId;
    }
    public @Nullable Output<String> getPolicy() {
        return this.policy;
    }
    public @Nullable Output<List<String>> getPolicyArns() {
        return this.policyArns;
    }
    public @Nullable Output<String> getRoleArn() {
        return this.roleArn;
    }
    public @Nullable Output<String> getSessionName() {
        return this.sessionName;
    }
    public @Nullable Output<Map<String,String>> getTags() {
        return this.tags;
    }
    public @Nullable Output<List<String>> getTransitiveTagKeys() {
        return this.transitiveTagKeys;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProviderAssumeRoleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> durationSeconds;
        private @Nullable Output<String> externalId;
        private @Nullable Output<String> policy;
        private @Nullable Output<List<String>> policyArns;
        private @Nullable Output<String> roleArn;
        private @Nullable Output<String> sessionName;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<List<String>> transitiveTagKeys;

        public Builder() {
    	      // Empty
        }

        public Builder(ProviderAssumeRoleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.durationSeconds = defaults.durationSeconds;
    	      this.externalId = defaults.externalId;
    	      this.policy = defaults.policy;
    	      this.policyArns = defaults.policyArns;
    	      this.roleArn = defaults.roleArn;
    	      this.sessionName = defaults.sessionName;
    	      this.tags = defaults.tags;
    	      this.transitiveTagKeys = defaults.transitiveTagKeys;
        }

        public Builder durationSeconds(@Nullable Output<Integer> durationSeconds) {
            this.durationSeconds = durationSeconds;
            return this;
        }
        public Builder externalId(@Nullable Output<String> externalId) {
            this.externalId = externalId;
            return this;
        }
        public Builder policy(@Nullable Output<String> policy) {
            this.policy = policy;
            return this;
        }
        public Builder policyArns(@Nullable Output<List<String>> policyArns) {
            this.policyArns = policyArns;
            return this;
        }
        public Builder roleArn(@Nullable Output<String> roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public Builder sessionName(@Nullable Output<String> sessionName) {
            this.sessionName = sessionName;
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder transitiveTagKeys(@Nullable Output<List<String>> transitiveTagKeys) {
            this.transitiveTagKeys = transitiveTagKeys;
            return this;
        }        public ProviderAssumeRoleArgs build() {
            return new ProviderAssumeRoleArgs(durationSeconds, externalId, policy, policyArns, roleArn, sessionName, tags, transitiveTagKeys);
        }
    }
}
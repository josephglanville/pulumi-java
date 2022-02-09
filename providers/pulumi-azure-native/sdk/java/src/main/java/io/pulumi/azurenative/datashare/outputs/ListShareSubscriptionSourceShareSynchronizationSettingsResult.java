// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datashare.outputs;

import io.pulumi.azurenative.datashare.outputs.ScheduledSourceSynchronizationSettingResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ListShareSubscriptionSourceShareSynchronizationSettingsResult {
    private final @Nullable String nextLink;
    private final List<ScheduledSourceSynchronizationSettingResponse> value;

    @OutputCustomType.Constructor({"nextLink","value"})
    private ListShareSubscriptionSourceShareSynchronizationSettingsResult(
        @Nullable String nextLink,
        List<ScheduledSourceSynchronizationSettingResponse> value) {
        this.nextLink = nextLink;
        this.value = Objects.requireNonNull(value);
    }

    public Optional<String> getNextLink() {
        return Optional.ofNullable(this.nextLink);
    }
    public List<ScheduledSourceSynchronizationSettingResponse> getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListShareSubscriptionSourceShareSynchronizationSettingsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String nextLink;
        private List<ScheduledSourceSynchronizationSettingResponse> value;

        public Builder() {
    	      // Empty
        }

        public Builder(ListShareSubscriptionSourceShareSynchronizationSettingsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nextLink = defaults.nextLink;
    	      this.value = defaults.value;
        }

        public Builder setNextLink(@Nullable String nextLink) {
            this.nextLink = nextLink;
            return this;
        }

        public Builder setValue(List<ScheduledSourceSynchronizationSettingResponse> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public ListShareSubscriptionSourceShareSynchronizationSettingsResult build() {
            return new ListShareSubscriptionSourceShareSynchronizationSettingsResult(nextLink, value);
        }
    }
}

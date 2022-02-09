// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.azurenative.web.outputs.RequestsBasedTriggerResponse;
import io.pulumi.azurenative.web.outputs.SlowRequestsBasedTriggerResponse;
import io.pulumi.azurenative.web.outputs.StatusCodesBasedTriggerResponse;
import io.pulumi.azurenative.web.outputs.StatusCodesRangeBasedTriggerResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AutoHealTriggersResponse {
    private final @Nullable Integer privateBytesInKB;
    private final @Nullable RequestsBasedTriggerResponse requests;
    private final @Nullable SlowRequestsBasedTriggerResponse slowRequests;
    private final @Nullable List<SlowRequestsBasedTriggerResponse> slowRequestsWithPath;
    private final @Nullable List<StatusCodesBasedTriggerResponse> statusCodes;
    private final @Nullable List<StatusCodesRangeBasedTriggerResponse> statusCodesRange;

    @OutputCustomType.Constructor({"privateBytesInKB","requests","slowRequests","slowRequestsWithPath","statusCodes","statusCodesRange"})
    private AutoHealTriggersResponse(
        @Nullable Integer privateBytesInKB,
        @Nullable RequestsBasedTriggerResponse requests,
        @Nullable SlowRequestsBasedTriggerResponse slowRequests,
        @Nullable List<SlowRequestsBasedTriggerResponse> slowRequestsWithPath,
        @Nullable List<StatusCodesBasedTriggerResponse> statusCodes,
        @Nullable List<StatusCodesRangeBasedTriggerResponse> statusCodesRange) {
        this.privateBytesInKB = privateBytesInKB;
        this.requests = requests;
        this.slowRequests = slowRequests;
        this.slowRequestsWithPath = slowRequestsWithPath;
        this.statusCodes = statusCodes;
        this.statusCodesRange = statusCodesRange;
    }

    public Optional<Integer> getPrivateBytesInKB() {
        return Optional.ofNullable(this.privateBytesInKB);
    }
    public Optional<RequestsBasedTriggerResponse> getRequests() {
        return Optional.ofNullable(this.requests);
    }
    public Optional<SlowRequestsBasedTriggerResponse> getSlowRequests() {
        return Optional.ofNullable(this.slowRequests);
    }
    public List<SlowRequestsBasedTriggerResponse> getSlowRequestsWithPath() {
        return this.slowRequestsWithPath == null ? List.of() : this.slowRequestsWithPath;
    }
    public List<StatusCodesBasedTriggerResponse> getStatusCodes() {
        return this.statusCodes == null ? List.of() : this.statusCodes;
    }
    public List<StatusCodesRangeBasedTriggerResponse> getStatusCodesRange() {
        return this.statusCodesRange == null ? List.of() : this.statusCodesRange;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoHealTriggersResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer privateBytesInKB;
        private @Nullable RequestsBasedTriggerResponse requests;
        private @Nullable SlowRequestsBasedTriggerResponse slowRequests;
        private @Nullable List<SlowRequestsBasedTriggerResponse> slowRequestsWithPath;
        private @Nullable List<StatusCodesBasedTriggerResponse> statusCodes;
        private @Nullable List<StatusCodesRangeBasedTriggerResponse> statusCodesRange;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoHealTriggersResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.privateBytesInKB = defaults.privateBytesInKB;
    	      this.requests = defaults.requests;
    	      this.slowRequests = defaults.slowRequests;
    	      this.slowRequestsWithPath = defaults.slowRequestsWithPath;
    	      this.statusCodes = defaults.statusCodes;
    	      this.statusCodesRange = defaults.statusCodesRange;
        }

        public Builder setPrivateBytesInKB(@Nullable Integer privateBytesInKB) {
            this.privateBytesInKB = privateBytesInKB;
            return this;
        }

        public Builder setRequests(@Nullable RequestsBasedTriggerResponse requests) {
            this.requests = requests;
            return this;
        }

        public Builder setSlowRequests(@Nullable SlowRequestsBasedTriggerResponse slowRequests) {
            this.slowRequests = slowRequests;
            return this;
        }

        public Builder setSlowRequestsWithPath(@Nullable List<SlowRequestsBasedTriggerResponse> slowRequestsWithPath) {
            this.slowRequestsWithPath = slowRequestsWithPath;
            return this;
        }

        public Builder setStatusCodes(@Nullable List<StatusCodesBasedTriggerResponse> statusCodes) {
            this.statusCodes = statusCodes;
            return this;
        }

        public Builder setStatusCodesRange(@Nullable List<StatusCodesRangeBasedTriggerResponse> statusCodesRange) {
            this.statusCodesRange = statusCodesRange;
            return this;
        }

        public AutoHealTriggersResponse build() {
            return new AutoHealTriggersResponse(privateBytesInKB, requests, slowRequests, slowRequestsWithPath, statusCodes, statusCodesRange);
        }
    }
}

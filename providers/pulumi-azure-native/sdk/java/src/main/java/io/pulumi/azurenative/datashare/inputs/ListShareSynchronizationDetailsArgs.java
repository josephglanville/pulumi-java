// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datashare.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ListShareSynchronizationDetailsArgs extends io.pulumi.resources.InvokeArgs {

    public static final ListShareSynchronizationDetailsArgs Empty = new ListShareSynchronizationDetailsArgs();

    /**
     * The name of the share account.
     * 
     */
    @Import(name="accountName", required=true)
      private final String accountName;

    public String getAccountName() {
        return this.accountName;
    }

    /**
     * Email of the user who created the synchronization
     * 
     */
    @Import(name="consumerEmail")
      private final @Nullable String consumerEmail;

    public Optional<String> getConsumerEmail() {
        return this.consumerEmail == null ? Optional.empty() : Optional.ofNullable(this.consumerEmail);
    }

    /**
     * Name of the user who created the synchronization
     * 
     */
    @Import(name="consumerName")
      private final @Nullable String consumerName;

    public Optional<String> getConsumerName() {
        return this.consumerName == null ? Optional.empty() : Optional.ofNullable(this.consumerName);
    }

    /**
     * Tenant name of the consumer who created the synchronization
     * 
     */
    @Import(name="consumerTenantName")
      private final @Nullable String consumerTenantName;

    public Optional<String> getConsumerTenantName() {
        return this.consumerTenantName == null ? Optional.empty() : Optional.ofNullable(this.consumerTenantName);
    }

    /**
     * synchronization duration
     * 
     */
    @Import(name="durationMs")
      private final @Nullable Integer durationMs;

    public Optional<Integer> getDurationMs() {
        return this.durationMs == null ? Optional.empty() : Optional.ofNullable(this.durationMs);
    }

    /**
     * End time of synchronization
     * 
     */
    @Import(name="endTime")
      private final @Nullable String endTime;

    public Optional<String> getEndTime() {
        return this.endTime == null ? Optional.empty() : Optional.ofNullable(this.endTime);
    }

    /**
     * Filters the results using OData syntax.
     * 
     */
    @Import(name="filter")
      private final @Nullable String filter;

    public Optional<String> getFilter() {
        return this.filter == null ? Optional.empty() : Optional.ofNullable(this.filter);
    }

    /**
     * message of synchronization
     * 
     */
    @Import(name="message")
      private final @Nullable String message;

    public Optional<String> getMessage() {
        return this.message == null ? Optional.empty() : Optional.ofNullable(this.message);
    }

    /**
     * Sorts the results using OData syntax.
     * 
     */
    @Import(name="orderby")
      private final @Nullable String orderby;

    public Optional<String> getOrderby() {
        return this.orderby == null ? Optional.empty() : Optional.ofNullable(this.orderby);
    }

    /**
     * The resource group name.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the share.
     * 
     */
    @Import(name="shareName", required=true)
      private final String shareName;

    public String getShareName() {
        return this.shareName;
    }

    /**
     * Continuation token
     * 
     */
    @Import(name="skipToken")
      private final @Nullable String skipToken;

    public Optional<String> getSkipToken() {
        return this.skipToken == null ? Optional.empty() : Optional.ofNullable(this.skipToken);
    }

    /**
     * start time of synchronization
     * 
     */
    @Import(name="startTime")
      private final @Nullable String startTime;

    public Optional<String> getStartTime() {
        return this.startTime == null ? Optional.empty() : Optional.ofNullable(this.startTime);
    }

    /**
     * Raw Status
     * 
     */
    @Import(name="status")
      private final @Nullable String status;

    public Optional<String> getStatus() {
        return this.status == null ? Optional.empty() : Optional.ofNullable(this.status);
    }

    /**
     * Synchronization id
     * 
     */
    @Import(name="synchronizationId")
      private final @Nullable String synchronizationId;

    public Optional<String> getSynchronizationId() {
        return this.synchronizationId == null ? Optional.empty() : Optional.ofNullable(this.synchronizationId);
    }

    public ListShareSynchronizationDetailsArgs(
        String accountName,
        @Nullable String consumerEmail,
        @Nullable String consumerName,
        @Nullable String consumerTenantName,
        @Nullable Integer durationMs,
        @Nullable String endTime,
        @Nullable String filter,
        @Nullable String message,
        @Nullable String orderby,
        String resourceGroupName,
        String shareName,
        @Nullable String skipToken,
        @Nullable String startTime,
        @Nullable String status,
        @Nullable String synchronizationId) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.consumerEmail = consumerEmail;
        this.consumerName = consumerName;
        this.consumerTenantName = consumerTenantName;
        this.durationMs = durationMs;
        this.endTime = endTime;
        this.filter = filter;
        this.message = message;
        this.orderby = orderby;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.shareName = Objects.requireNonNull(shareName, "expected parameter 'shareName' to be non-null");
        this.skipToken = skipToken;
        this.startTime = startTime;
        this.status = status;
        this.synchronizationId = synchronizationId;
    }

    private ListShareSynchronizationDetailsArgs() {
        this.accountName = null;
        this.consumerEmail = null;
        this.consumerName = null;
        this.consumerTenantName = null;
        this.durationMs = null;
        this.endTime = null;
        this.filter = null;
        this.message = null;
        this.orderby = null;
        this.resourceGroupName = null;
        this.shareName = null;
        this.skipToken = null;
        this.startTime = null;
        this.status = null;
        this.synchronizationId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListShareSynchronizationDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accountName;
        private @Nullable String consumerEmail;
        private @Nullable String consumerName;
        private @Nullable String consumerTenantName;
        private @Nullable Integer durationMs;
        private @Nullable String endTime;
        private @Nullable String filter;
        private @Nullable String message;
        private @Nullable String orderby;
        private String resourceGroupName;
        private String shareName;
        private @Nullable String skipToken;
        private @Nullable String startTime;
        private @Nullable String status;
        private @Nullable String synchronizationId;

        public Builder() {
    	      // Empty
        }

        public Builder(ListShareSynchronizationDetailsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.consumerEmail = defaults.consumerEmail;
    	      this.consumerName = defaults.consumerName;
    	      this.consumerTenantName = defaults.consumerTenantName;
    	      this.durationMs = defaults.durationMs;
    	      this.endTime = defaults.endTime;
    	      this.filter = defaults.filter;
    	      this.message = defaults.message;
    	      this.orderby = defaults.orderby;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.shareName = defaults.shareName;
    	      this.skipToken = defaults.skipToken;
    	      this.startTime = defaults.startTime;
    	      this.status = defaults.status;
    	      this.synchronizationId = defaults.synchronizationId;
        }

        public Builder accountName(String accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }
        public Builder consumerEmail(@Nullable String consumerEmail) {
            this.consumerEmail = consumerEmail;
            return this;
        }
        public Builder consumerName(@Nullable String consumerName) {
            this.consumerName = consumerName;
            return this;
        }
        public Builder consumerTenantName(@Nullable String consumerTenantName) {
            this.consumerTenantName = consumerTenantName;
            return this;
        }
        public Builder durationMs(@Nullable Integer durationMs) {
            this.durationMs = durationMs;
            return this;
        }
        public Builder endTime(@Nullable String endTime) {
            this.endTime = endTime;
            return this;
        }
        public Builder filter(@Nullable String filter) {
            this.filter = filter;
            return this;
        }
        public Builder message(@Nullable String message) {
            this.message = message;
            return this;
        }
        public Builder orderby(@Nullable String orderby) {
            this.orderby = orderby;
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder shareName(String shareName) {
            this.shareName = Objects.requireNonNull(shareName);
            return this;
        }
        public Builder skipToken(@Nullable String skipToken) {
            this.skipToken = skipToken;
            return this;
        }
        public Builder startTime(@Nullable String startTime) {
            this.startTime = startTime;
            return this;
        }
        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }
        public Builder synchronizationId(@Nullable String synchronizationId) {
            this.synchronizationId = synchronizationId;
            return this;
        }        public ListShareSynchronizationDetailsArgs build() {
            return new ListShareSynchronizationDetailsArgs(accountName, consumerEmail, consumerName, consumerTenantName, durationMs, endTime, filter, message, orderby, resourceGroupName, shareName, skipToken, startTime, status, synchronizationId);
        }
    }
}

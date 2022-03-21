// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.streamanalytics.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A grouping of information about the connection to the remote resource.
 * 
 */
public final class PrivateLinkServiceConnectionArgs extends io.pulumi.resources.ResourceArgs {

    public static final PrivateLinkServiceConnectionArgs Empty = new PrivateLinkServiceConnectionArgs();

    /**
     * The ID(s) of the group(s) obtained from the remote resource that this private endpoint should connect to. Required on PUT (CreateOrUpdate) requests.
     * 
     */
    @Import(name="groupIds")
      private final @Nullable Output<List<String>> groupIds;

    public Output<List<String>> getGroupIds() {
        return this.groupIds == null ? Output.empty() : this.groupIds;
    }

    /**
     * The resource id of the private link service. Required on PUT (CreateOrUpdate) requests.
     * 
     */
    @Import(name="privateLinkServiceId")
      private final @Nullable Output<String> privateLinkServiceId;

    public Output<String> getPrivateLinkServiceId() {
        return this.privateLinkServiceId == null ? Output.empty() : this.privateLinkServiceId;
    }

    /**
     * A message passed to the owner of the remote resource with this connection request. Restricted to 140 chars.
     * 
     */
    @Import(name="requestMessage")
      private final @Nullable Output<String> requestMessage;

    public Output<String> getRequestMessage() {
        return this.requestMessage == null ? Output.empty() : this.requestMessage;
    }

    public PrivateLinkServiceConnectionArgs(
        @Nullable Output<List<String>> groupIds,
        @Nullable Output<String> privateLinkServiceId,
        @Nullable Output<String> requestMessage) {
        this.groupIds = groupIds;
        this.privateLinkServiceId = privateLinkServiceId;
        this.requestMessage = requestMessage;
    }

    private PrivateLinkServiceConnectionArgs() {
        this.groupIds = Output.empty();
        this.privateLinkServiceId = Output.empty();
        this.requestMessage = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateLinkServiceConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> groupIds;
        private @Nullable Output<String> privateLinkServiceId;
        private @Nullable Output<String> requestMessage;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateLinkServiceConnectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groupIds = defaults.groupIds;
    	      this.privateLinkServiceId = defaults.privateLinkServiceId;
    	      this.requestMessage = defaults.requestMessage;
        }

        public Builder groupIds(@Nullable Output<List<String>> groupIds) {
            this.groupIds = groupIds;
            return this;
        }
        public Builder groupIds(@Nullable List<String> groupIds) {
            this.groupIds = Output.ofNullable(groupIds);
            return this;
        }
        public Builder groupIds(String... groupIds) {
            return groupIds(List.of(groupIds));
        }
        public Builder privateLinkServiceId(@Nullable Output<String> privateLinkServiceId) {
            this.privateLinkServiceId = privateLinkServiceId;
            return this;
        }
        public Builder privateLinkServiceId(@Nullable String privateLinkServiceId) {
            this.privateLinkServiceId = Output.ofNullable(privateLinkServiceId);
            return this;
        }
        public Builder requestMessage(@Nullable Output<String> requestMessage) {
            this.requestMessage = requestMessage;
            return this;
        }
        public Builder requestMessage(@Nullable String requestMessage) {
            this.requestMessage = Output.ofNullable(requestMessage);
            return this;
        }        public PrivateLinkServiceConnectionArgs build() {
            return new PrivateLinkServiceConnectionArgs(groupIds, privateLinkServiceId, requestMessage);
        }
    }
}

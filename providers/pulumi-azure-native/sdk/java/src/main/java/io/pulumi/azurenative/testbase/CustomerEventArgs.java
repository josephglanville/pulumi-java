// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.testbase;

import io.pulumi.azurenative.testbase.inputs.NotificationEventReceiverArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CustomerEventArgs extends io.pulumi.resources.ResourceArgs {

    public static final CustomerEventArgs Empty = new CustomerEventArgs();

    /**
     * The resource name of the Test Base Customer event.
     * 
     */
    @Import(name="customerEventName")
      private final @Nullable Output<String> customerEventName;

    public Output<String> getCustomerEventName() {
        return this.customerEventName == null ? Codegen.empty() : this.customerEventName;
    }

    /**
     * The name of the event subscribed to.
     * 
     */
    @Import(name="eventName", required=true)
      private final Output<String> eventName;

    public Output<String> getEventName() {
        return this.eventName;
    }

    /**
     * The notification event receivers.
     * 
     */
    @Import(name="receivers", required=true)
      private final Output<List<NotificationEventReceiverArgs>> receivers;

    public Output<List<NotificationEventReceiverArgs>> getReceivers() {
        return this.receivers;
    }

    /**
     * The name of the resource group that contains the resource.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The resource name of the Test Base Account.
     * 
     */
    @Import(name="testBaseAccountName", required=true)
      private final Output<String> testBaseAccountName;

    public Output<String> getTestBaseAccountName() {
        return this.testBaseAccountName;
    }

    public CustomerEventArgs(
        @Nullable Output<String> customerEventName,
        Output<String> eventName,
        Output<List<NotificationEventReceiverArgs>> receivers,
        Output<String> resourceGroupName,
        Output<String> testBaseAccountName) {
        this.customerEventName = customerEventName;
        this.eventName = Objects.requireNonNull(eventName, "expected parameter 'eventName' to be non-null");
        this.receivers = Objects.requireNonNull(receivers, "expected parameter 'receivers' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.testBaseAccountName = Objects.requireNonNull(testBaseAccountName, "expected parameter 'testBaseAccountName' to be non-null");
    }

    private CustomerEventArgs() {
        this.customerEventName = Codegen.empty();
        this.eventName = Codegen.empty();
        this.receivers = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.testBaseAccountName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomerEventArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> customerEventName;
        private Output<String> eventName;
        private Output<List<NotificationEventReceiverArgs>> receivers;
        private Output<String> resourceGroupName;
        private Output<String> testBaseAccountName;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomerEventArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customerEventName = defaults.customerEventName;
    	      this.eventName = defaults.eventName;
    	      this.receivers = defaults.receivers;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.testBaseAccountName = defaults.testBaseAccountName;
        }

        public Builder customerEventName(@Nullable Output<String> customerEventName) {
            this.customerEventName = customerEventName;
            return this;
        }
        public Builder customerEventName(@Nullable String customerEventName) {
            this.customerEventName = Codegen.ofNullable(customerEventName);
            return this;
        }
        public Builder eventName(Output<String> eventName) {
            this.eventName = Objects.requireNonNull(eventName);
            return this;
        }
        public Builder eventName(String eventName) {
            this.eventName = Output.of(Objects.requireNonNull(eventName));
            return this;
        }
        public Builder receivers(Output<List<NotificationEventReceiverArgs>> receivers) {
            this.receivers = Objects.requireNonNull(receivers);
            return this;
        }
        public Builder receivers(List<NotificationEventReceiverArgs> receivers) {
            this.receivers = Output.of(Objects.requireNonNull(receivers));
            return this;
        }
        public Builder receivers(NotificationEventReceiverArgs... receivers) {
            return receivers(List.of(receivers));
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder testBaseAccountName(Output<String> testBaseAccountName) {
            this.testBaseAccountName = Objects.requireNonNull(testBaseAccountName);
            return this;
        }
        public Builder testBaseAccountName(String testBaseAccountName) {
            this.testBaseAccountName = Output.of(Objects.requireNonNull(testBaseAccountName));
            return this;
        }        public CustomerEventArgs build() {
            return new CustomerEventArgs(customerEventName, eventName, receivers, resourceGroupName, testBaseAccountName);
        }
    }
}

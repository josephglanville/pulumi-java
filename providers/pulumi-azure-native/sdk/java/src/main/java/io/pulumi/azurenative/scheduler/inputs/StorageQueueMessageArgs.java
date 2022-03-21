// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.scheduler.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class StorageQueueMessageArgs extends io.pulumi.resources.ResourceArgs {

    public static final StorageQueueMessageArgs Empty = new StorageQueueMessageArgs();

    /**
     * Gets or sets the message.
     * 
     */
    @Import(name="message")
      private final @Nullable Output<String> message;

    public Output<String> getMessage() {
        return this.message == null ? Output.empty() : this.message;
    }

    /**
     * Gets or sets the queue name.
     * 
     */
    @Import(name="queueName")
      private final @Nullable Output<String> queueName;

    public Output<String> getQueueName() {
        return this.queueName == null ? Output.empty() : this.queueName;
    }

    /**
     * Gets or sets the SAS key.
     * 
     */
    @Import(name="sasToken")
      private final @Nullable Output<String> sasToken;

    public Output<String> getSasToken() {
        return this.sasToken == null ? Output.empty() : this.sasToken;
    }

    /**
     * Gets or sets the storage account name.
     * 
     */
    @Import(name="storageAccount")
      private final @Nullable Output<String> storageAccount;

    public Output<String> getStorageAccount() {
        return this.storageAccount == null ? Output.empty() : this.storageAccount;
    }

    public StorageQueueMessageArgs(
        @Nullable Output<String> message,
        @Nullable Output<String> queueName,
        @Nullable Output<String> sasToken,
        @Nullable Output<String> storageAccount) {
        this.message = message;
        this.queueName = queueName;
        this.sasToken = sasToken;
        this.storageAccount = storageAccount;
    }

    private StorageQueueMessageArgs() {
        this.message = Output.empty();
        this.queueName = Output.empty();
        this.sasToken = Output.empty();
        this.storageAccount = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StorageQueueMessageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> message;
        private @Nullable Output<String> queueName;
        private @Nullable Output<String> sasToken;
        private @Nullable Output<String> storageAccount;

        public Builder() {
    	      // Empty
        }

        public Builder(StorageQueueMessageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.message = defaults.message;
    	      this.queueName = defaults.queueName;
    	      this.sasToken = defaults.sasToken;
    	      this.storageAccount = defaults.storageAccount;
        }

        public Builder message(@Nullable Output<String> message) {
            this.message = message;
            return this;
        }
        public Builder message(@Nullable String message) {
            this.message = Output.ofNullable(message);
            return this;
        }
        public Builder queueName(@Nullable Output<String> queueName) {
            this.queueName = queueName;
            return this;
        }
        public Builder queueName(@Nullable String queueName) {
            this.queueName = Output.ofNullable(queueName);
            return this;
        }
        public Builder sasToken(@Nullable Output<String> sasToken) {
            this.sasToken = sasToken;
            return this;
        }
        public Builder sasToken(@Nullable String sasToken) {
            this.sasToken = Output.ofNullable(sasToken);
            return this;
        }
        public Builder storageAccount(@Nullable Output<String> storageAccount) {
            this.storageAccount = storageAccount;
            return this;
        }
        public Builder storageAccount(@Nullable String storageAccount) {
            this.storageAccount = Output.ofNullable(storageAccount);
            return this;
        }        public StorageQueueMessageArgs build() {
            return new StorageQueueMessageArgs(message, queueName, sasToken, storageAccount);
        }
    }
}

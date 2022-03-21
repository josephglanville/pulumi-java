// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.memorydb;

import io.pulumi.awsnative.memorydb.inputs.ACLTagArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ACLArgs extends io.pulumi.resources.ResourceArgs {

    public static final ACLArgs Empty = new ACLArgs();

    /**
     * The name of the acl.
     * 
     */
    @Import(name="aCLName")
      private final @Nullable Output<String> aCLName;

    public Output<String> getACLName() {
        return this.aCLName == null ? Output.empty() : this.aCLName;
    }

    /**
     * An array of key-value pairs to apply to this cluster.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<List<ACLTagArgs>> tags;

    public Output<List<ACLTagArgs>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * List of users associated to this acl.
     * 
     */
    @Import(name="userNames")
      private final @Nullable Output<List<String>> userNames;

    public Output<List<String>> getUserNames() {
        return this.userNames == null ? Output.empty() : this.userNames;
    }

    public ACLArgs(
        @Nullable Output<String> aCLName,
        @Nullable Output<List<ACLTagArgs>> tags,
        @Nullable Output<List<String>> userNames) {
        this.aCLName = aCLName;
        this.tags = tags;
        this.userNames = userNames;
    }

    private ACLArgs() {
        this.aCLName = Output.empty();
        this.tags = Output.empty();
        this.userNames = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ACLArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> aCLName;
        private @Nullable Output<List<ACLTagArgs>> tags;
        private @Nullable Output<List<String>> userNames;

        public Builder() {
    	      // Empty
        }

        public Builder(ACLArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aCLName = defaults.aCLName;
    	      this.tags = defaults.tags;
    	      this.userNames = defaults.userNames;
        }

        public Builder aCLName(@Nullable Output<String> aCLName) {
            this.aCLName = aCLName;
            return this;
        }
        public Builder aCLName(@Nullable String aCLName) {
            this.aCLName = Output.ofNullable(aCLName);
            return this;
        }
        public Builder tags(@Nullable Output<List<ACLTagArgs>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable List<ACLTagArgs> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public Builder tags(ACLTagArgs... tags) {
            return tags(List.of(tags));
        }
        public Builder userNames(@Nullable Output<List<String>> userNames) {
            this.userNames = userNames;
            return this;
        }
        public Builder userNames(@Nullable List<String> userNames) {
            this.userNames = Output.ofNullable(userNames);
            return this;
        }
        public Builder userNames(String... userNames) {
            return userNames(List.of(userNames));
        }        public ACLArgs build() {
            return new ACLArgs(aCLName, tags, userNames);
        }
    }
}

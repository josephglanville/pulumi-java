// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.connect;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class UserHierarchyGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final UserHierarchyGroupArgs Empty = new UserHierarchyGroupArgs();

    /**
     * The identifier of the Amazon Connect instance.
     * 
     */
    @Import(name="instanceArn", required=true)
      private final Output<String> instanceArn;

    public Output<String> getInstanceArn() {
        return this.instanceArn;
    }

    /**
     * The name of the user hierarchy group.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * The Amazon Resource Name (ARN) for the parent user hierarchy group.
     * 
     */
    @Import(name="parentGroupArn")
      private final @Nullable Output<String> parentGroupArn;

    public Output<String> getParentGroupArn() {
        return this.parentGroupArn == null ? Output.empty() : this.parentGroupArn;
    }

    public UserHierarchyGroupArgs(
        Output<String> instanceArn,
        @Nullable Output<String> name,
        @Nullable Output<String> parentGroupArn) {
        this.instanceArn = Objects.requireNonNull(instanceArn, "expected parameter 'instanceArn' to be non-null");
        this.name = name;
        this.parentGroupArn = parentGroupArn;
    }

    private UserHierarchyGroupArgs() {
        this.instanceArn = Output.empty();
        this.name = Output.empty();
        this.parentGroupArn = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserHierarchyGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> instanceArn;
        private @Nullable Output<String> name;
        private @Nullable Output<String> parentGroupArn;

        public Builder() {
    	      // Empty
        }

        public Builder(UserHierarchyGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceArn = defaults.instanceArn;
    	      this.name = defaults.name;
    	      this.parentGroupArn = defaults.parentGroupArn;
        }

        public Builder instanceArn(Output<String> instanceArn) {
            this.instanceArn = Objects.requireNonNull(instanceArn);
            return this;
        }
        public Builder instanceArn(String instanceArn) {
            this.instanceArn = Output.of(Objects.requireNonNull(instanceArn));
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public Builder parentGroupArn(@Nullable Output<String> parentGroupArn) {
            this.parentGroupArn = parentGroupArn;
            return this;
        }
        public Builder parentGroupArn(@Nullable String parentGroupArn) {
            this.parentGroupArn = Output.ofNullable(parentGroupArn);
            return this;
        }        public UserHierarchyGroupArgs build() {
            return new UserHierarchyGroupArgs(instanceArn, name, parentGroupArn);
        }
    }
}

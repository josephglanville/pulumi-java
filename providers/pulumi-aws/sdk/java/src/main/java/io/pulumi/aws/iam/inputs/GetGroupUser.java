// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iam.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetGroupUser extends io.pulumi.resources.InvokeArgs {

    public static final GetGroupUser Empty = new GetGroupUser();

    /**
     * The Amazon Resource Name (ARN) specifying the iam user.
     * 
     */
    @Import(name="arn", required=true)
      private final String arn;

    public String getArn() {
        return this.arn;
    }

    /**
     * The path to the iam user.
     * 
     */
    @Import(name="path", required=true)
      private final String path;

    public String getPath() {
        return this.path;
    }

    /**
     * The stable and unique string identifying the iam user.
     * 
     */
    @Import(name="userId", required=true)
      private final String userId;

    public String getUserId() {
        return this.userId;
    }

    /**
     * The name of the iam user.
     * 
     */
    @Import(name="userName", required=true)
      private final String userName;

    public String getUserName() {
        return this.userName;
    }

    public GetGroupUser(
        String arn,
        String path,
        String userId,
        String userName) {
        this.arn = Objects.requireNonNull(arn, "expected parameter 'arn' to be non-null");
        this.path = Objects.requireNonNull(path, "expected parameter 'path' to be non-null");
        this.userId = Objects.requireNonNull(userId, "expected parameter 'userId' to be non-null");
        this.userName = Objects.requireNonNull(userName, "expected parameter 'userName' to be non-null");
    }

    private GetGroupUser() {
        this.arn = null;
        this.path = null;
        this.userId = null;
        this.userName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGroupUser defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private String path;
        private String userId;
        private String userName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGroupUser defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.path = defaults.path;
    	      this.userId = defaults.userId;
    	      this.userName = defaults.userName;
        }

        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        public Builder path(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }
        public Builder userId(String userId) {
            this.userId = Objects.requireNonNull(userId);
            return this;
        }
        public Builder userName(String userName) {
            this.userName = Objects.requireNonNull(userName);
            return this;
        }        public GetGroupUser build() {
            return new GetGroupUser(arn, path, userId, userName);
        }
    }
}

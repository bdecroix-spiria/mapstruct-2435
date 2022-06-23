// This class is in the unnamed package
import org.mapstruct.Mapper;

public class UnnamedPackageNestedMapperIssue {
    @Mapper
    public interface NestedUnnamedPackageMapper {
        Target map(Source source);
    }

    public static class Source {
        private String property;

        public String getProperty() { return property; }
        public void setProperty(String property) { this.property = property; }
    }

    public static class Target {
        private String property;

        public String getProperty() { return property; }
        public void setProperty(String property) { this.property = property; }
    }
}
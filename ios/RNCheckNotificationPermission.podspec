
Pod::Spec.new do |s|
  s.name         = "RNCheckNotificationPermission"
  s.version      = "1.0.0"
  s.summary      = "RNCheckNotificationPermission"
  s.description  = <<-DESC
                  RNCheckNotificationPermission
                   DESC
  s.homepage     = "https://github.com/duongxuannam/react-native-check-notification-permission"
  s.license      = "MIT"
  # s.license      = { :type => "MIT", :file => "FILE_LICENSE" }
  s.author             = { "author" => "author@domain.cn" }
  s.platform     = :ios, "7.0"
  s.source       = { :git => "https://github.com/author/RNCheckNotificationPermission.git", :tag => "master" }
  s.source_files  = "RNCheckNotificationPermission/**/*.{h,m}"
  s.requires_arc = true


  s.dependency "React"
  #s.dependency "others"

end

  